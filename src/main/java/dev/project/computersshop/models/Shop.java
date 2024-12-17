package dev.project.computersshop.models;

public class Shop {
    int id;
    String name;
    String tax_id;

    public Shop( String name, String tax_id) {
        this.name = name;
        this.tax_id = tax_id;
    }

    public Shop(int id, String name, String tax_id) {
        this.id = id;
        this.name = name;
        this.tax_id = tax_id;
    }

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTax_id() {
        return tax_id;
    }
    public void setTax_id(String tax_id) {
        this.tax_id = tax_id;
    }

}
