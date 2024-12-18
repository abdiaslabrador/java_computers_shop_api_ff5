package dev.project.computersshop.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.project.computersshop.dtos.ComputerBrandDto;
import dev.project.computersshop.dtos.ComputerDto;
import dev.project.computersshop.dtos.ComputerDtoResponse;
import dev.project.computersshop.msg.Msg;
import dev.project.computersshop.services.ComputerService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/computers")
public class ComputerController {

    private final ComputerService computerService;
    
    @Autowired
    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }

    // Get all computers
    @GetMapping("")
    public List<ComputerDtoResponse> index(){
        return computerService.findAll();
    }

    @PostMapping("")
    public ResponseEntity<ComputerDtoResponse>  createComputer(@RequestBody ComputerDto computer){
        if(isInvalidComputer(computer)){
            return ResponseEntity.badRequest().body(null);
        }
        ComputerDtoResponse computerResponse = computerService.save(computer);
        return ResponseEntity.status(HttpStatus.CREATED).body(computerResponse);
    }

    @PostMapping("/search")
    public ResponseEntity<List<ComputerDtoResponse>> searchComputerByBrand(@RequestBody ComputerBrandDto computer){
        if(computer == null){return ResponseEntity.badRequest().body(null);}
        
        List<ComputerDtoResponse> computerResponse = computerService.searchComputerByBrand(computer.brand());
        return ResponseEntity.status(HttpStatus.OK).body(computerResponse);
    }

    // Get a computer
    @GetMapping("/{id}")
    public ResponseEntity<ComputerDtoResponse> getComputer(@PathVariable int id){
         ComputerDtoResponse computer = computerService.getById(id);
         return ResponseEntity.status(HttpStatus.OK).body(computer);
    }

    // Delete a computer
    @DeleteMapping("/{id}")
    public ResponseEntity<Msg> deleteComputer(@PathVariable int id){
         computerService.deleteById(id);
         return ResponseEntity.status(HttpStatus.OK).body(new Msg(HttpStatus.OK, "Deleted successfully"));
    }

    private boolean isInvalidComputer(ComputerDto computer) {
        return computer.getBrand() == null || 
               computer.getMemory() == null || 
               computer.getCpu() == null || 
               computer.getOperatingSystem() == null ||
               computer.getProduct() == null;
    }
}