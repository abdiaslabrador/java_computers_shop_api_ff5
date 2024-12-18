package dev.project.computersshop.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.project.computersshop.dtos.ComputerDto;
import dev.project.computersshop.dtos.ComputerDtoResponse;
import dev.project.computersshop.exceptions.computer.ComputerNotFoundException;
import dev.project.computersshop.interfaces.IGenericService;
import dev.project.computersshop.models.Computer;
import dev.project.computersshop.repositories.ComputerRepository;
import dev.project.computersshop.repositories.ProductRepository;


@Service
public class ComputerService implements IGenericService<ComputerDtoResponse, ComputerDto> {
    private final ComputerRepository computerRepository;
    private final ProductRepository productRepository;

    public ComputerService(ComputerRepository computerRepository, ProductRepository productRepository) {
        this.productRepository = productRepository;
        this.computerRepository = computerRepository;
    }

    @Override
    public List<ComputerDtoResponse> findAll() {
        List<ComputerDtoResponse> computers = new ArrayList<>();
        for (Computer computer : computerRepository.findAll()) {
            computers.add(new ComputerDtoResponse(computer));
        }
        return computers;
    }

    @Override
    public ComputerDtoResponse save(ComputerDto dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public ComputerDtoResponse getById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public void deleteById(int id) {
        Computer computer = computerRepository.findById(id).orElseThrow(()-> new ComputerNotFoundException("Computer not found by id"));
        productRepository.delete(computer.getProduct());
    }

}