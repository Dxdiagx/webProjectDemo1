package demoProject.webProjectDemo1.dataAccess.abstracts;
import demoProject.webProjectDemo1.entities.concretes.Category;
import demoProject.webProjectDemo1.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<Product,Integer> {
    Product getByProductName(String productName);
    Product getByProductNameAndCategoryId(String productName,int categoryId);
    List<Product> getByProductNameOrCategoryName(String productName,String categoryName);
    List<Product> getByProductNameContains(String productName);
    List<Product> getByProductNameStartsWith(String productName);

}
