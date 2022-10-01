package demoProject.webProjectDemo1.business.abstracts;

import demoProject.webProjectDemo1.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

}
