package dev.project.computersshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;

import dev.project.computersshop.models.Product;


public interface ProductRepository  extends JpaRepository<Product, Integer> {

}
