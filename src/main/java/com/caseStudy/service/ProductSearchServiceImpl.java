package com.caseStudy.service;

import com.caseStudy.DAO.ProductCategoriesDAO;
import com.caseStudy.DAO.ProductSearchDAO;
import com.caseStudy.exception.ResourceNotFoundException;
import com.caseStudy.model.Category;
import com.caseStudy.model.ProductBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductSearchServiceImpl implements ProductSearchService {

    @Autowired
    private ProductSearchDAO productSearchDAO;

    @Autowired
    private ProductCategoriesDAO productCategoriesDAO;

    @Override
    public List<Category> getAllCategories() {
        return productCategoriesDAO.findAll();
    }

    @Override
    public ProductBO getProductById(Long productId) {
        return productSearchDAO.findById(productId).orElseThrow(() -> new ResourceNotFoundException("Invalid Product Id"));
    }

    @Override
    public List<ProductBO> getAllProducts(ProductBO product) {
        Example<ProductBO> productBOExample = Example.of(product);
        return productSearchDAO.findAll(productBOExample);
    }

    public ProductBO saveProduct(ProductBO product) {
        Example<ProductBO> productBOExample = Example.of(product);
        return productSearchDAO.save(product);
    }
}
