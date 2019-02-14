package com.appiskey.accountservice.repository;

import com.appiskey.accountservice.model.Role;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by tahir on 2/11/19.
 */
public interface RoleRepository extends PagingAndSortingRepository<Role, UUID> {
}
