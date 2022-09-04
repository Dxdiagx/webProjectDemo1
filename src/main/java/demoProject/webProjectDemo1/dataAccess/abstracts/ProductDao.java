package demoProject.webProjectDemo1.dataAccess.abstracts;
import demoProject.webProjectDemo1.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {
}
