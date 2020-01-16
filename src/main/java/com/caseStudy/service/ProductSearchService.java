package com.caseStudy.service;

import com.caseStudy.model.Category;
import com.caseStudy.model.ProductBO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductSearchService {

    List<Category> getAllCategories();

    ProductBO getProductById(Long productId);

    List<ProductBO> getAllProducts(ProductBO productId);
}
