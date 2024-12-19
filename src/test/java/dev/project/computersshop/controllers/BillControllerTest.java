package dev.project.computersshop.controllers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import dev.project.computersshop.dtos.BillDtoResponse;
import dev.project.computersshop.models.Bill;
import dev.project.computersshop.models.BillDet;
import dev.project.computersshop.models.Client;
import dev.project.computersshop.models.Computer;
import dev.project.computersshop.models.Product;
import dev.project.computersshop.models.Shop;
import dev.project.computersshop.services.BillService;

@ExtendWith(MockitoExtension.class)
public class BillControllerTest {

    @Mock
    private BillService billService;

    @InjectMocks
    private BillController billController;

    private MockMvc mockMvc;
    private Computer computer;
    private Product product;
    private Shop shop;
    private Client client;
    private List<BillDet> billDets;
    private Bill bill;
    private List<BillDtoResponse> bills;

    private ObjectMapper mapper;
    
    @BeforeEach
    public void setUp() {
        mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mockMvc = MockMvcBuilders.standaloneSetup(billController).build();
        computer = new Computer(1, "Dell", "16GB", "Intel Core i7", "Windows 10", null);
        product = new Product(1, "Laptop", "LP001", 10, 1000.0, null, computer);
        shop = new Shop(1, "Fnac", "Abdias Labrador","1234W56", null);
        client = new Client(1, "John", "Doe", "12345678A", null);
        billDets = List.of(new BillDet(1, 10, 10.0, 10.0, product, null));
        bill = new Bill(1, LocalDateTime.now(), 100.0, 100.0, 100.0, 0, shop, client, billDets);
        bills = List.of(new BillDtoResponse(bill));
    }

    @Test
    public void testIndex() {
        try {

        when(billService.findAll()).thenReturn(bills);

        MockHttpServletResponse response = mockMvc.perform(get("/api/v1/bills")
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
}