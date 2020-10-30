package com.psb.psbloanassignment.repository;

import com.psb.psbloanassignment.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findAllByOrderByNameAsc();
}
