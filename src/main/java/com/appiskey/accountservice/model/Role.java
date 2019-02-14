package com.appiskey.accountservice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tahir on 2/12/19.
 */
@Data
@Entity
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@Table
@DiscriminatorValue("childClasss")
public class Role extends BaseModel {
    @Column(nullable = false)
    @NotNull
    @Size(message = "Role Name is required!")
    private String roleName;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "role_permission",
            joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id", referencedColumnName = "id")
    )
    private List<Permission> rolePermissions = new ArrayList<>();

//    @ManyToOne(cascade=CascadeType.PERSIST)
//    @JoinColumn(name = "userid")
//    private User user;
//
//    @OneToMany(mappedBy = "group")
//    private List<Permission> permissions;

//    @ManyToMany(cascade = CascadeType.PERSIST)
//    @JoinTable(name = "group_permission",
//            joinColumns = @JoinColumn(name = "permission_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "group_id",
//                    referencedColumnName = "id"))
//    private List<Permission> groupPermissions;
}
