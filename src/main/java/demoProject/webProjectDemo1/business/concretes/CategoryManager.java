package demoProject.webProjectDemo1.business.concretes;
import demoProject.webProjectDemo1.business.abstracts.CategoryService;
import demoProject.webProjectDemo1.dataAccess.abstracts.CategoryDao;
import demoProject.webProjectDemo1.entities.concretes.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryManager implements CategoryService {
    private CategoryDao categoryDao;
    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }






    @Override
    public List<Category> getAll() {
        return this.categoryDao.findAll();
    }
}
