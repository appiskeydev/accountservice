package com.appiskey.accountservice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tahir on 2/11/19.
 */

@EqualsAndHashCode(callSuper=true)
@Data
@Entity
@Table(name="user")
@DiscriminatorValue("childClasss")
public class User extends BaseModel {

    @NotNull
    @Column(unique = true, nullable = false)
    @Size(message = "Username is Required!")
    private String username;

    @NotNull
    @Size(min = 8, message = "Minimum password length: 8 characters")
    private String password;

    private String type;



    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id")
    )
    private List<Role> userRole = new ArrayList<>();


    private boolean accountNonExpired, accountNonLocked, credentialsNonExpired, enabled;


}
