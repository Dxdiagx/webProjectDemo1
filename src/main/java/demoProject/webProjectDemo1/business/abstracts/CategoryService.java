package demoProject.webProjectDemo1.business.abstracts;

import demoProject.webProjectDemo1.entities.concretes.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAll();
}
