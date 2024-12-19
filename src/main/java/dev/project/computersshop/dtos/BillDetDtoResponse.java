package dev.project.computersshop.dtos;

import dev.project.computersshop.dtos.product.ProductDtoResponse;
import dev.project.computersshop.models.BillDet;

public class BillDetDtoResponse {
      
       private int id;
       private int quantity; 
       private double salePrice;
       private double subTotal;
       private ProductDtoResponse product;

        public BillDetDtoResponse(BillDet billDet) {
            this.id = billDet.getId();
            this.quantity = billDet.getQuantity();
            this.salePrice = billDet.getSalePrice();
            this.subTotal = billDet.getSubTotal();
            this.product = new ProductDtoResponse(billDet.getProduct());
        }  
         
        public int getId() {
            return id;
        }
        public int getQuantity() {
            return quantity;
        }
        public double getSalePrice() {
            return salePrice;
        }
        public double getSubTotal() {
            return subTotal;
        }
        public ProductDtoResponse getProduct() {
            return product;
        }
            
}
