package com.appiskey.accountservice.service;

import com.appiskey.accountservice.model.Permission;
import org.springframework.http.ResponseEntity;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by tahir on 2/11/19.
 */
public interface PermissionService {

    public Permission insert(Permission item);
    public Iterable<Permission> findAll();
    public Permission findByItem(Permission item);
    public Permission findById(UUID it);
    public Permission delete(Permission item);
    public Permission update(Permission item);

}
