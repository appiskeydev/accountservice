package com.appiskey.accountservice.repository;

import com.appiskey.accountservice.model.Permission;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by tahir on 2/11/19.
 */
public interface PermissionRepository  extends PagingAndSortingRepository<Permission, UUID> {
}
