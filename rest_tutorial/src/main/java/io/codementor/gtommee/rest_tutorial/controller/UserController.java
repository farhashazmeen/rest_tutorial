package io.codementor.gtommee.rest_tutorial.controller;


import io.codementor.gtommee.rest_tutorial.models.User;
import io.codementor.gtommee.rest_tutorial.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/Users")
public class UserController {
    @Autowired
    public UserRepository repository;

    @RequestMapping(value = "/**", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUsersById(@PathVariable("id") Integer id) {
        return repository.findBy_id(id);
    }

   // @PutMapping
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT , consumes = MediaType.APPLICATION_JSON_VALUE)
    public void modifyUserById(@RequestBody User pets) {
        //pets.set_id(id);
        repository.save(pets);
    }
    @PostMapping
    public String createUser(@RequestBody User pets) {
        //pets.set_id( id);
        repository.save(pets);
        return "User Created Successfully";
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Integer id)
    {
        repository.delete(repository.findBy_id(id));
        return "User Deleted Successfully";
    }
}