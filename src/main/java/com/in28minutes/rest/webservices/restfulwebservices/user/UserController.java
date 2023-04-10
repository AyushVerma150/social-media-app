package com.in28minutes.rest.webservices.restfulwebservices.user;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    private final UserDaoService userDaoService;

    public UserController(UserDaoService userDaoService) {
        this.userDaoService = userDaoService;
    }

    @GetMapping(path = "/users")
    public List<User> findAll() {
        return userDaoService.findAll();
    }


    @GetMapping(path = "/users/{id}")
    public User findById(@PathVariable Integer id) {
        User user = userDaoService.findById(id);
        if (user == null) {
            throw new UserNotFoundException( "User you are trying to access is deleted or removed." );
        }
        return user;
    }

    // Create a New user
    @PostMapping("users")
    public ResponseEntity<User> create(@Valid @RequestBody User user) {
        User savedUser = userDaoService.create( user );
        URI location = ServletUriComponentsBuilder.fromCurrentRequest( ).path( "/{id}" ).buildAndExpand( savedUser.getId( ) ).toUri( );
        return ResponseEntity.created( location ).build( );
    }


    @DeleteMapping("users/{id}")
    public User deleteUser(@PathVariable Integer id) {
        return userDaoService.deleteById( id );
    }
}