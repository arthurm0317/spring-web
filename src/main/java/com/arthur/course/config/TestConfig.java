package com.arthur.course.config;

import com.arthur.course.entities.Order;
import com.arthur.course.entities.User;
import com.arthur.course.entities.enums.OrderStatus;
import com.arthur.course.repositories.OrderRepository;
import com.arthur.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u = new User(null, "arthur", "arthur@gmail.com", "75988821124", "boquinhasafada02");
        User u2 = new User(null, "raquel", "art@gmail.com", "75988821124", "buticocagado57");

        userRepository.saveAll(Arrays.asList(u,u2));

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT,u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED,u);
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
    }
}
