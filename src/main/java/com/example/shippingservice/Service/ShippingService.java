package com.example.shippingservice.Service;

import com.example.shippingservice.Entity.Shipping;
import com.example.shippingservice.Repository.ShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
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

    @Cacheable("getAll")
    public List<Shipping> getAll(){
        return shippingRepository.findAll();
    }


    public void deleteById(Long id) {
        try {
            shippingRepository.deleteById(id);
            System.out.println("Delete OK !");
        }catch (Exception e){
            System.out.println("Delete Fail Check Again !");
        }
    }


    public Shipping updateShippingById(Long id, Shipping shipping) {
        Shipping shippingData = shippingRepository.findById(id).get();

        shippingData.setShippingCompany(shipping.getShippingCompany());
        shippingData.setRegion(shipping.getRegion());
        shippingData.setDeliveryCost(shipping.getDeliveryCost());

        return shippingRepository.save(shippingData);
    }




}
