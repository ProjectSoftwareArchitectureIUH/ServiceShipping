package com.example.shippingservice.Controller;

import com.example.shippingservice.Entity.Shipping;
import com.example.shippingservice.Service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author MPHuy on 23/11/2021
 */
@RestController
@RequestMapping("/shipping")
@CrossOrigin
public class ShippingController {
    @Autowired
    private ShippingService shippingService;

    @GetMapping("/all/")
    public List<Shipping> getAllOrder(){
        return shippingService.getAll();
    }
    @GetMapping("/{id}")
    public Shipping getById(@PathVariable long id){
        return shippingService.getById(id);
    }
    @PostMapping("/")
    public Shipping getById(@RequestBody Shipping shipping){
        return shippingService.save(shipping);
    }
}
