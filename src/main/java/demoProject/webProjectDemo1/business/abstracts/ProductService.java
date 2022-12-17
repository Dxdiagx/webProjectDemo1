package demoProject.webProjectDemo1.business.abstracts;

import demoProject.webProjectDemo1.core.utilities.results.DataResult;
import demoProject.webProjectDemo1.core.utilities.results.Result;
import demoProject.webProjectDemo1.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    DataResult< List<Product>> getAll();
    Result add(Product product);
    DataResult< Product> getByProductName(String productName);
    DataResult<Product> getByProductNameAndCategoryId(String productName,int categoryId);
    DataResult<List<Product>> getByProductNameOrCategoryName(String productName,String categoryName);
    DataResult< List<Product>> getByProductNameContains(String productName);
    DataResult<List<Product> >getByProductNameStartsWith(String productName);


}
