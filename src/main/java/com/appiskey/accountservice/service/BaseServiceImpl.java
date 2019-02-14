package com.appiskey.accountservice.service;

import com.appiskey.accountservice.exception.ResourceNotFoundException;
import com.appiskey.accountservice.model.MyGenaric;
import com.appiskey.accountservice.model.User;

import java.util.Optional;

/**
 * Created by tahir on 2/14/19.
 */
public class BaseServiceImpl extends MyGenaric {

    public Object getOptional(Optional<?> itemOptional) {
        Optional.ofNullable(itemOptional
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", null)));
        return itemOptional.get();
    }

    public Object getObject(Object obj) {

//        this.myGenarics.put("item",
//        return (MyGenaric) this.myGenarics;
        return obj;
    }

//    public Object getCustomObject()


}
