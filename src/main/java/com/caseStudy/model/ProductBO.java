package com.caseStudy.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "products")
public class ProductBO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;
    private String type;
    private String brand;
    private String size;
    private Double price;
    private String seller;

    public ProductBO() {}

    @ManyToOne
    @JoinColumn(name = "category_id")
    @JsonBackReference
    private Category category;

    public ProductBO(Long id, String type, String brand, String size, Double price, String seller, Category category) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.seller = seller;
        this.category = category;
    }
}
