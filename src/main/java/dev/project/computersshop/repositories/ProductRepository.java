package dev.project.computersshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.project.computersshop.models.Product;


public interface ProductRepository  extends JpaRepository<Product, Integer> {
}
