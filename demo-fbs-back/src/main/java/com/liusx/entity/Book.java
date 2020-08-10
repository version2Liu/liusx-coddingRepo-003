package com.liusx.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * description: Book <br>
 * date: 2020/8/10 0010 23:24 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 */
@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String author;
    private String publish;
    private String pages;
    private float price;
}
