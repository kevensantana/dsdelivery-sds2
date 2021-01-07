package com.devknow.dsdelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devknow.dsdelivery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
