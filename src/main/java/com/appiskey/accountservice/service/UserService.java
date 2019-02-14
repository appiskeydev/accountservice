package com.appiskey.accountservice.service;

import com.appiskey.accountservice.model.User;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by tahir on 2/11/19.
 */
public interface UserService {

    public User insert(User item);
    public Iterable<User> findAll();
    public User findByItem(User item);
    public User findById(UUID it);
    public User delete(User item);
    public User update(User item);

}
