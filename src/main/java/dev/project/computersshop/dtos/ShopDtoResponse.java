package dev.project.computersshop.dtos;

import dev.project.computersshop.models.Shop;

public class ShopDtoResponse {
    private int id;
    private String name;
    private String ownerName;
    private String taxId;  
    
    public ShopDtoResponse(Shop shop) {
        this.id = shop.getId();
        this.name = shop.getName();
        this.ownerName = shop.getOwnerName();
        this.taxId = shop.getTaxId();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getTaxId() {
        return taxId;
    }

}

