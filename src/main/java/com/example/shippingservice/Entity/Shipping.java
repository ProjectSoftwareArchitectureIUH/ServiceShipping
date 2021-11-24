package com.example.shippingservice.Entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author MPHuy on 23/11/2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "shipping_table")
public class Shipping {
    @Id
    @GeneratedValue
    private long id;
    private String shippingCompany;
    private String region;
    private String deliveryCost;
}
