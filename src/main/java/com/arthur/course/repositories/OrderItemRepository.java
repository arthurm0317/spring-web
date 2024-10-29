package com.arthur.course.repositories;

import com.arthur.course.entities.OrderItem;
import com.arthur.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
