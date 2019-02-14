package com.appiskey.accountservice.controller;

import com.appiskey.accountservice.model.User;
import com.appiskey.accountservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by khawar on 1/30/19.
 */

@RestController
@RequestMapping("/users")
public class UserController extends BaseController {

    @Autowired
    UserService itemService;

    @GetMapping
    public Iterable<User> getItems() {
        return itemService.findAll();
    }

    @PostMapping
    public User create(@Valid @RequestBody User item) {
        return itemService.insert(item);
    }

    @GetMapping("/{uuid}")
    @ResponseBody
    public User getItem(@PathVariable("uuid") UUID id) {
        return itemService.findById(id);
    }

    @DeleteMapping
    @ResponseBody
    public User delete(@RequestBody User item) {
        return itemService.delete(item);
    }

    @PutMapping
    @ResponseBody
    public User edit(@RequestBody User item) {
        return itemService.update(item);
    }

}

