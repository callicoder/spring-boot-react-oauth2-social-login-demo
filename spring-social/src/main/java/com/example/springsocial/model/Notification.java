package com.example.springsocial.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Table(name = "notifications")

public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "content")
    private String content;

    @Column(name = "status")
    private boolean status;

    @Column(name = "created_at")
    private Date createdAt;
}
