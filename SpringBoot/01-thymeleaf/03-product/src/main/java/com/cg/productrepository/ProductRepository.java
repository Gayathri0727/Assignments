package com.cg.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
