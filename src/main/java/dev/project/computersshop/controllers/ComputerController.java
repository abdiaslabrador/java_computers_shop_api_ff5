package dev.project.computersshop.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.project.computersshop.dtos.ComputerDto;
import dev.project.computersshop.dtos.ComputerDtoResponse;
import dev.project.computersshop.msg.Msg;
import dev.project.computersshop.services.ComputerService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/computers")
public class ComputerController {

    private final ComputerService computerService;

    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }

    // Get all computers
    @GetMapping("")
    public List<ComputerDtoResponse> index(){
        return computerService.findAll();
    }

    @PostMapping("")
    public ComputerDtoResponse createComputer(@RequestBody ComputerDto entity){
        return null;
    }

    // Delete a computer
    @DeleteMapping("/{id}")
    public ResponseEntity<Msg> deleteComputer(@PathVariable int id){
         computerService.deleteById(id);
         return ResponseEntity.status(HttpStatus.OK).body(new Msg(HttpStatus.OK, "Deleted successfully"));
    }

}