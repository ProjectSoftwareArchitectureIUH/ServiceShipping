package com.example.shippingservice.Repository;

import com.example.shippingservice.Entity.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author MPHuy on 23/11/2021
 */

public interface ShippingRepository extends JpaRepository<Shipping,Long> {

}
