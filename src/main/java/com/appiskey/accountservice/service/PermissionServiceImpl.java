package com.appiskey.accountservice.service;

/**
 * Created by tahir on 2/11/19.
 */

import com.appiskey.accountservice.exception.ResourceNotFoundException;
import com.appiskey.accountservice.model.Permission;
import com.appiskey.accountservice.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by khawar on 1/31/19.
 */
@Service("permissionService")
public class PermissionServiceImpl implements PermissionService{

    @Autowired
    PermissionRepository itemRepo;
    @Override
    public Iterable<Permission> findAll() {
        return  itemRepo.findAll();
    }

    @Override
    public Permission findById(UUID id) {
        Optional<Permission> itemOpt = Optional.ofNullable(itemRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Permission", "id", id)));
        return itemOpt.get();
    }

    @Override
    public Permission findByItem(Permission item){
        return this.findById(item.getId());
    }

    @Override
    public Permission insert(Permission item) {
        return itemRepo.save(item);
    }

    @Override
    public Permission delete(Permission item) {
        this.findByItem(item);
        return itemRepo.save(item);
    }

    @Override
    public Permission update(Permission item) {
        this.findByItem(item);
        return itemRepo.save(item);
    }
}