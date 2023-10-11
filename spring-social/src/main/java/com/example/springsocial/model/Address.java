package com.example.springsocial.model;

import lombok.Data;
import org.locationtech.jts.geom.Point;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "street")
    private String street;

    @Column(name = "apt")
    private String apt;

    @Column(name="city")
    private String  city;

    @Column(name="state")
    private String state;

    @Column(name="zip_code")
    private String zipCode;

    @Column(name="country")
    private String country;


    @Column(name = "primary")
    private boolean primary;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "created_at")
    private Date createdAt;

}
