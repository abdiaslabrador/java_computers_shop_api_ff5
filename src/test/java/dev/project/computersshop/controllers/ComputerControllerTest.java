package dev.project.computersshop.controllers;

import org.springframework.http.MediaType;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.project.computersshop.dtos.ComputerBrandDto;
import dev.project.computersshop.dtos.computer.ComputerDto;
import dev.project.computersshop.dtos.computer.ComputerDtoResponse;
import dev.project.computersshop.dtos.computer.ComputerProductDto;
import dev.project.computersshop.models.Computer;
import dev.project.computersshop.models.Product;
import dev.project.computersshop.services.ComputerService;

@ExtendWith(MockitoExtension.class)
public class ComputerControllerTest {

    @Mock
    private ComputerService computerService;

    @InjectMocks
    private ComputerController computerController;
    private List<ComputerDtoResponse> computerDtoResponse;
    private Computer computer;
    private MockMvc mockMvc;
    private Product product;
    private ComputerDto computerDto;
    private ComputerProductDto productDto;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(computerController).build();
        product = new Product(1, "Laptop", "LP001", 10, 1000.0, null, null);
        computer = new Computer(1, "Dell", "16GB", "Intel Core i7", "Windows 10", product);
        productDto = new ComputerProductDto("Laptop", "LP001", 10, 1000.0);
        computerDto = new ComputerDto("Dell", "16GB", "Intel Core i7", "Windows 10", productDto);
        computerDtoResponse = List.of(new ComputerDtoResponse(computer));
    }

    @Test
    void testIndex() {
        try {
            when(computerService.findAll()).thenReturn(computerDtoResponse);

            // Act
            MockHttpServletResponse response = mockMvc.perform(get("/api/v1/computers")
                    .accept(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andReturn()
                    .getResponse();

            assertThat(response.getStatus(), is(200));
            assertThat(response.getContentAsString(), containsString("Dell"));
            assertThat(response.getContentAsString(), containsString("1"));

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Test
    void testCreateComputer() {
        try {
            when(computerService.save(any(ComputerDto.class))).thenReturn(new ComputerDtoResponse(computer));

            // Act
            MockHttpServletResponse response = mockMvc.perform(post("/api/v1/computers")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(asJsonString(computerDto)))
                    .andExpect(status().isCreated())
                    .andReturn()
                    .getResponse();

            assertThat(response.getStatus(), is(201));
            assertThat(response.getContentAsString(), containsString("Dell"));
            assertThat(response.getContentAsString(), containsString("1"));

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Test
    void testCreateComputerInvalid() {
        try {
            computerDto = new ComputerDto(null, null, null, null, null);

            // Act
            MockHttpServletResponse response = mockMvc.perform(post("/api/v1/computers")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(asJsonString(computerDto)))
                    .andExpect(status().isBadRequest())
                    .andReturn()
                    .getResponse();

            assertThat(response.getStatus(), is(400));

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Test
    void testDeleteComputer() {
        try {
           doNothing().when(computerService).deleteById(1);

            // Act
            MockHttpServletResponse response = mockMvc.perform(delete("/api/v1/computers/1"))
                    .andExpect(status().isOk())
                    .andReturn()
                    .getResponse();

            assertThat(response.getStatus(), is(200));
            assertThat(response.getContentAsString(), containsString("Deleted successfully"));

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Test
    void testGetComputer() {
        try {
            when(computerService.getById(1)).thenReturn(computerDtoResponse.get(0));

            // Act
            MockHttpServletResponse response = mockMvc.perform(get("/api/v1/computers/1")
                    .accept(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andReturn()
                    .getResponse();

            assertThat(response.getStatus(), is(200));
            assertThat(response.getContentAsString(), containsString("Dell"));
            assertThat(response.getContentAsString(), containsString("1"));

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Test
    void testSearchComputerByBrand() {
        try {
            ComputerBrandDto brandDto = new ComputerBrandDto("Dell");
            when(computerService.searchComputerByBrand(brandDto.brand())).thenReturn(computerDtoResponse);

            // Act
            MockHttpServletResponse response = mockMvc.perform(post("/api/v1/computers/search")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(asJsonString(brandDto)))
                    .andExpect(status().isOk())
                    .andReturn()
                    .getResponse();

            assertThat(response.getStatus(), is(200));
            assertThat(response.getContentAsString(), containsString("Dell"));
            assertThat(response.getContentAsString(), containsString("1"));

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
