package dev.project.computersshop.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.project.computersshop.models.Computer;

public interface ComputerRepository extends JpaRepository<Computer, Integer> {
    List<Computer> findByBrandIgnoreCase(String brand);
}


