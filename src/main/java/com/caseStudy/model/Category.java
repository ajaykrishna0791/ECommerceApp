package com.caseStudy.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;
    @Column(name = "category_name")
    private String name;
    @JsonManagedReference
    @OneToMany(mappedBy = "category")
    private List<ProductBO> productBO;

    public Category() {}
}
