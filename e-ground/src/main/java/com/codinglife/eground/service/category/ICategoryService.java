package com.codinglife.eground.service.category;

import com.codinglife.eground.model.Category;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface ICategoryService {
    Category getCategoryById(Long id);
    Category getCategoryByName(String name);
    List<Category> getAllCategories();
    Category addCategory(Category category);
    Category updateCategory(Category category, Long id);
    void deleteCategoryById(Long id);

}
