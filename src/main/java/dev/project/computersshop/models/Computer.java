package dev.project.computersshop.models;

public class Computer {
    int id;
    String brand;
    String memory;
    String cpu;
    String operatingSystem;

    public Computer(String brand, String memory, String cpu, String operatingSystem) {
        this.brand = brand;
        this.memory = memory;
        this.cpu = cpu;
        this.operatingSystem = operatingSystem;
    }

    public Computer(int id, String brand, String memory, String cpu, String operatingSystem) {
        this.id = id;
        this.brand = brand;
        this.memory = memory;
        this.cpu = cpu;
        this.operatingSystem = operatingSystem;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getMemory() {
        return memory;
    }
    public void setMemory(String memory) {
        this.memory = memory;
    }
    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    
}
