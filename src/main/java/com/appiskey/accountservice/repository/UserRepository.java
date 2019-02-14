package com.appiskey.accountservice.repository;

import com.appiskey.accountservice.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BooleanSupplier;

/**
 * Created by tahir on 2/11/19.
 */
public interface  UserRepository extends PagingAndSortingRepository<User, UUID> {

    Optional<User> findByIdAndAccountNonExpiredAndAccountNonLockedAndCredentialsNonExpiredAndEnabled(
            UUID id,
            Boolean accountNonExpired,
            Boolean accountNonLocked,
            Boolean credentialsNonExpired,
            Boolean enabled
            );
}
