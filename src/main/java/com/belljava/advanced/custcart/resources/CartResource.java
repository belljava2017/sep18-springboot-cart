package com.belljava.advanced.custcart.resources;

import com.belljava.advanced.custcart.model.Cart;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class CartResource {


    @RequestMapping(value="/cart/{id}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = "application/json")
    public Cart getCart(@PathVariable int id){
        Cart c = new Cart();
        if(id == 1){
            c.setCost(200);
            c.setCartname("Wallmart");
        }else if(id == 2){
            c.setCartname("Costco");
            c.setCost(300);
        }

        return c;
    }



}
