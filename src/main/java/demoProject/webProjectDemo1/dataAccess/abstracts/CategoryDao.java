package demoProject.webProjectDemo1.dataAccess.abstracts;
import demoProject.webProjectDemo1.entities.concretes.Category;
import demoProject.webProjectDemo1.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category,Integer> {

    Category getByCategoryName(String category_name);


}
