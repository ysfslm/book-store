package com.yit.bookstore.repository;

import com.yit.bookstore.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {



}
