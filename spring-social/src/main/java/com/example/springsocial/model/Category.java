package com.example.springsocial.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
}
