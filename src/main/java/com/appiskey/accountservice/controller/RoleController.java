package com.appiskey.accountservice.controller;

import com.appiskey.accountservice.model.Role;
import com.appiskey.accountservice.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

/**
 * Created by tahir on 1/30/19.
 */

@RestController
@RequestMapping("/roles")
public class RoleController extends BaseController {

    @Autowired
    RoleService itemService;

    @GetMapping
    public Iterable<Role> getItems() {
        return itemService.findAll();
    }

    @PostMapping
    public Role create(@Valid @RequestBody Role item) {
        return itemService.insert(item);
    }

    @GetMapping("/{uuid}")
    @ResponseBody
    public Role getItem(@PathVariable("uuid") UUID id) {
        return itemService.findById(id);
    }

    @DeleteMapping
    @ResponseBody
    public Role delete(@RequestBody Role item) {
        return itemService.delete(item);
    }

    @PutMapping
    @ResponseBody
    public Role edit(@RequestBody Role item) {
        return itemService.update(item);
    }

}

