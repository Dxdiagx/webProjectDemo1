package demoProject.webProjectDemo1.dataAccess.abstracts;
import demoProject.webProjectDemo1.entities.concretes.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category,Integer> {




}
