package com.arthur.course.resources;

import com.arthur.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "arthur", "arthur@gmail.com", "75988821124", "laeledesgraca");
        return ResponseEntity.ok().body(u);
    }
}
