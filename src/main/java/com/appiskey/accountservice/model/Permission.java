
package com.appiskey.accountservice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

/**
 * Created by tahir on 2/11/19.
 */

@EqualsAndHashCode(callSuper=true)
@Data
@Entity
@Getter
@Setter
@Table(name="permission")
@DiscriminatorValue("childClasss")
public class Permission extends BaseModel {

    @NotNull
    @Column(nullable = false)
    @NotNull
    @Size( message = "Name is Required!")
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    protected Permission parent;

    @OneToMany(mappedBy = "parent")
    protected Set<Permission> children;


}
