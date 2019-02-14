package com.appiskey.accountservice.service;

import com.appiskey.accountservice.model.Role;
import org.springframework.http.ResponseEntity;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by tahir on 2/11/19.
 */
public interface RoleService {

    public Role insert(Role item);
    public Iterable<Role> findAll();
    public Role findByItem(Role item);
    public Role findById(UUID it);
    public Role delete(Role item);
    public Role update(Role item);

}
