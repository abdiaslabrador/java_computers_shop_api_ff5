package dev.project.computersshop.dtos;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import dev.project.computersshop.models.Bill;

public class BillDtoResponse {
    private int id;
    private LocalDateTime date;
    private double subTotal;
    private double total;
    private double totalPaid;
    private double discount;
    private ShopDtoResponse shop;
    private ClientDtoResponse client;
    private List<BillDetDtoResponse> billDets;

    public BillDtoResponse(Bill bill) {
        this.id = bill.getId();
        this.date = bill.getDate();
        this.subTotal = bill.getSubTotal();
        this.total = bill.getTotal();
        this.totalPaid = bill.getTotalPaid();
        this.discount = bill.getDiscount();
        this.shop = new ShopDtoResponse(bill.getShop());
        this.client = new ClientDtoResponse(bill.getClient());
        this.billDets = bill.getBillDets().stream()
            .map(BillDetDtoResponse::new)
            .collect(Collectors.toList());
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public double getTotal() {
        return total;
    }

    public double getTotalPaid() {
        return totalPaid;
    }

    public double getDiscount() {
        return discount;
    }

    public ShopDtoResponse getShop() {
        return shop;
    }

    public ClientDtoResponse getClient() {
        return client;
    }

    public List<BillDetDtoResponse> getBillDets() {
        return billDets;
    }
}
