package dev.project.computersshop.dtos.computer;


public class ComputerDto {
    private String brand ;
    private String memory ;
    private String cpu ;
    private String operatingSystem ;
    private ComputerProductDto product;

    public ComputerDto(String brand ,String memory ,String cpu ,String operatingSystem ,ComputerProductDto product ) {
        this.brand = brand;
        this.memory = memory;
        this.cpu = cpu;
        this.operatingSystem = operatingSystem;
        this.product = product;
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

    public ComputerProductDto getProduct() {
        return product;
    }

    
}
