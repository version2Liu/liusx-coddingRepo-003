package com.liusx.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * description: Book <br>
 * date: 2020/8/11 12:36 <br>
 * author: liusx <br>
 * version: 1.0 <br>
 */
@Entity
@Data
public class Book {

    @Id
    private Integer id;
    private String name;
    private String author;
    private String publish;
    private Integer pages;
    private float price;
}
