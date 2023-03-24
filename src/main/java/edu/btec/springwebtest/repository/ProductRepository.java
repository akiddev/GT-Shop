package edu.btec.springwebtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.btec.springwebtest.domain.Product;
import jakarta.persistence.JoinColumn;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
