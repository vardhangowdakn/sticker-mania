package com.example.StickersMania.repository;

import com.example.StickersMania.entity.Customer;
import com.example.StickersMania.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Optional<Customer> findByEmail(String email);
    Optional<Customer> findByEmailOrMobileNumber(String email, String mobileNumber);

    List<Customer> email(String email);
}
