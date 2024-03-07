package com.chandrika.edu.orderservice.repository;


import com.chandrika.edu.orderservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
