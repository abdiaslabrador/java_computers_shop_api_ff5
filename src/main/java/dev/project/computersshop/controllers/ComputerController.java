package dev.project.computersshop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.project.computersshop.dtos.ComputerDtoResponse;
import dev.project.computersshop.services.ComputerService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/computers")
public class ComputerController {

    private final ComputerService computerService;

    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }

    // Get all appointments
    @GetMapping("")
    public List<ComputerDtoResponse> index(){
        return computerService.findAll();
    }

}