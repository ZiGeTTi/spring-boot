package com.pluralsight.springboot.ticket.events;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product,  Integer> {
    public List<Product> findByEventId(int eventId);
}
