package demoProject.webProjectDemo1.api.controllers;
import demoProject.webProjectDemo1.business.abstracts.CategoryService;
import demoProject.webProjectDemo1.entities.concretes.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {

    @Autowired
    public CategoriesController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    private CategoryService categoryService;


    @GetMapping("/getall")
    public List<Category> getAll(){
        return this.categoryService.getAll();
    }
}


