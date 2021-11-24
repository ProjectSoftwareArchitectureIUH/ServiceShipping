package com.example.shippingservice.Service;

import com.example.shippingservice.Entity.Shipping;
import com.example.shippingservice.Repository.ShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author MPHuy on 23/11/2021
 */
@Service
public class ShippingService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ShippingRepository shippingRepository;
    public Shipping save(Shipping shipping){
        return shippingRepository.save(shipping);
    }
    public Shipping getById(long id){
        return shippingRepository.findById(id).get();
    }
    public List<Shipping> getAll(){
        return shippingRepository.findAll();
    }
}
