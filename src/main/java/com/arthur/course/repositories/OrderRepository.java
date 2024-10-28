package com.arthur.course.repositories;

import com.arthur.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
