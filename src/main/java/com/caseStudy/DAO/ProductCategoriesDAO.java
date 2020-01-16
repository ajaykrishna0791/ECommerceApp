package com.caseStudy.DAO;

import com.caseStudy.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ProductCategoriesDAO extends JpaRepository<Category, Long> {
}
