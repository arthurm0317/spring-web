package com.arthur.course.config;

import com.arthur.course.entities.User;
import com.arthur.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u = new User(null, "arthur", "arthur@gmail.com", "75988821124", "laeledesgraca");
        User u2 = new User(null, "raquel", "art@gmail.com", "75988821124", "laeledesgraca");

        userRepository.saveAll(Arrays.asList(u,u2));
    }
}
