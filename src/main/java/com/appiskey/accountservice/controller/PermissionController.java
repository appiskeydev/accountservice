package com.appiskey.accountservice.controller;

import com.appiskey.accountservice.model.Permission;
import com.appiskey.accountservice.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by tahir on 1/30/19.
 */

@RestController
@RequestMapping("/permissions")
public class PermissionController extends BaseController {

    @Autowired
    PermissionService itemService;


    @GetMapping
    public Iterable<Permission> getItems() {
        return itemService.findAll();
    }

    @PostMapping
    public Permission create(@Valid @RequestBody Permission item) {
        return itemService.insert(item);
    }

    @GetMapping("/{uuid}")
    @ResponseBody
    public Permission getItem(@PathVariable("uuid") UUID id) {
        return itemService.findById(id);
    }

    @DeleteMapping
    @ResponseBody
    public Permission delete(@RequestBody Permission item) {
        return itemService.delete(item);
    }

    @PutMapping
    @ResponseBody
    public Permission edit(@RequestBody Permission item) {
        return itemService.update(item);
    }

}

