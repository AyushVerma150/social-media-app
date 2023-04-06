package com.in28minutes.rest.webservices.restfulwebservices.user;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserDaoService {
    // FindAll
    // Save
    // FindOne

    // Static List for now
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Ayush Verma", LocalDate.now().minusYears(30)));
        users.add(new User(2, "Jim", LocalDate.now().minusYears(20)));
        users.add(new User(3, "Naman Goyal", LocalDate.now().minusYears(21)));
        users.add(new User(4, "Aman", LocalDate.now().minusYears(33)));
    }

    public List<User> findAll(){
        return users;
    }
}