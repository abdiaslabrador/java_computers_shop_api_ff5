package dev.project.computersshop.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import dev.project.computersshop.dtos.BillDtoResponse;
import dev.project.computersshop.models.Bill;
import dev.project.computersshop.repositories.BillRepository;

@Service
public class BillService {
    private BillRepository billRepository;

    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    public List<BillDtoResponse> findAll() {
        List<BillDtoResponse> bills = new ArrayList<>();
        for (Bill bill : billRepository.findAll()) {
            bills.add(new BillDtoResponse(bill));
        }
        return bills;
    }
}
