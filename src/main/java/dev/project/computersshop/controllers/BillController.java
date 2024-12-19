package dev.project.computersshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.project.computersshop.dtos.BillDtoResponse;
import dev.project.computersshop.services.BillService;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/bills")
public class BillController {

    private final BillService billService;
    
    @Autowired
    public BillController(BillService billService) {
        this.billService = billService;
    }

    // Get all computers
    @GetMapping("")
    public List<BillDtoResponse> index(){
        return billService.findAll();
    }
}