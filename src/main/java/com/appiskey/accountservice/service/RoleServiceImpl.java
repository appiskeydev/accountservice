package com.appiskey.accountservice.service;

/**
 * Created by tahir on 2/11/19.
 */

import com.appiskey.accountservice.exception.ResourceNotFoundException;
import com.appiskey.accountservice.model.Role;
import com.appiskey.accountservice.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;
import java.util.UUID;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository itemRepo;

    @Override
    public Iterable<Role> findAll() {
        return  itemRepo.findAll();
    }

    @Override
    public Role findById(UUID id) {
        Optional<Role> itemOpt = Optional.ofNullable(itemRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Role", "id", id)));
        return itemOpt.get();
    }

    @Override
    public Role findByItem(Role item){
        return this.findById(item.getId());
    }

    @Override
    public Role insert(Role item) {
        return itemRepo.save(item);
    }

    @Override
    public Role delete(Role item) {
        this.findByItem(item);
        return itemRepo.save(item);
    }

    @Override
    public Role update(Role item) {
        this.findByItem(item);
        return itemRepo.save(item);
    }

}