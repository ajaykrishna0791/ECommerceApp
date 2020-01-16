package com.caseStudy.test;

import com.caseStudy.SpringbootStarterApp;
import com.caseStudy.controller.ProductSearchController;
import com.caseStudy.model.Category;
import com.caseStudy.service.ProductSearchService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootStarterApp.class)
public class ProductSearchControllerTest {

    @Autowired
    private ProductSearchController productSearchController;

    @MockBean
    private ProductSearchService productSearchService;

    @Test
    public void testGetAllCategories(){

        Category category = new Category();
        category.setName("cloths");
        List<Category> categories = Arrays.asList(category);
        Mockito.when(productSearchService.getAllCategories()).thenReturn(categories);
        Assert.assertEquals(1, productSearchController.getAllCategories().size());
    }


}
