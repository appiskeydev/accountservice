package com.appiskey.accountservice.service;

/**
 * Created by tahir on 2/11/19.
 */

import com.appiskey.accountservice.exception.ResourceNotFoundException;
import com.appiskey.accountservice.model.User;
import com.appiskey.accountservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by khawar on 1/31/19.
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl implements UserService{

    @Autowired
    UserRepository itemRepo;

    @Override
    public Iterable<User> findAll() {
        return  itemRepo.findAll();
    }

    @Override
    public User findById(UUID id) {
        Optional<User> itemOpt = Optional.ofNullable(itemRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", id)));
        return itemOpt.get();
    }

    @Override
    public User findByItem(User item){
    return this.findById(item.getId());
    }

    @Override
    public User insert(User item) {
        return itemRepo.save(item);
    }

    @Override
    public User delete(User item) {
        this.findByItem(item);
        return itemRepo.save(item);
    }

    @Override
    public User update(User item) {
        this.findByItem(item);
        return itemRepo.save(item);
    }
}