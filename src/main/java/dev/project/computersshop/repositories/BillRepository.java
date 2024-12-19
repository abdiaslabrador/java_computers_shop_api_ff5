package dev.project.computersshop.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import dev.project.computersshop.models.Bill;

public interface  BillRepository extends JpaRepository<Bill, Integer> {
    
}
