package com.caseStudy.controller;

import com.caseStudy.exception.ResourceNotFoundException;
import com.caseStudy.model.Category;
import com.caseStudy.model.ProductBO;
import com.caseStudy.service.ProductSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductSearchController {

    @Autowired
    private ProductSearchService productSearchService;

    /**
     * Get all available product categories
     * @return List<Category>
     */
    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public List<Category> getAllCategories() {
        return productSearchService.getAllCategories();
    }

    /**
     * Get product details by id
     * @param productId
     * @return ProductBO
     */
    @RequestMapping(value = "/product/id/{id}", method = RequestMethod.GET)
    public ProductBO getProductById(@PathVariable("id") Long productId) {
        return productSearchService.getProductById(productId);
    }

    /**
     * Get product details by brand
     * @param brand
     * @return ProductBO
     */
    @RequestMapping(value = "/product/brand/{brand}", method = RequestMethod.GET)
    public List<ProductBO> getProductByBrand(@PathVariable("brand") String brand) {
        ProductBO productBO = new ProductBO();
        productBO.setBrand(brand);
        return productSearchService.getAllProducts(productBO);
    }

    /**
     * Get product details by size
     * @param size
     * @return ProductBO
     */
    @RequestMapping(value = "/product/size/{size}", method = RequestMethod.GET)
    public List<ProductBO> getProductBySize(@PathVariable("size") String size) {
        ProductBO productBO = new ProductBO();
        productBO.setSize(size);
        return productSearchService.getAllProducts(productBO);
    }

    /**
     * Get list of all products
     * @param product
     * @return List<ProductBO>
     */
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<ProductBO> getAllProductsBy(@RequestBody(required = false) ProductBO product) {
        try{
            return productSearchService.getAllProducts(product);
        }catch (Exception e){
            System.out.println(e.getMessage());
            throw  new ResourceNotFoundException("Provide valid json input");
        }

    }

}
