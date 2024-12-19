package dev.project.computersshop.dtos.computer;

import dev.project.computersshop.models.Computer;

public class ComputerDtoResponse {

    private int id;
    private String brand ;
    private String memory ;
    private String cpu ;
    private String operatingSystem ;
    private ComputerProductDtoResponse product;

    public ComputerDtoResponse(Computer computer){
        this.id = computer.getId();
        this.brand = computer.getBrand();
        this.memory = computer.getMemory();
        this.cpu = computer.getCpu();
        this.operatingSystem = computer.getOperatingSystem();
        this.product = new ComputerProductDtoResponse(computer.getProduct());
        
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getMemory() {
        return memory;
    }

    public String getCpu() {
        return cpu;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public ComputerProductDtoResponse getProduct() {
        return product;
    }
    
}