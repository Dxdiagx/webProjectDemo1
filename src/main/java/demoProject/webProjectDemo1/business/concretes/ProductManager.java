package demoProject.webProjectDemo1.business.concretes;
import demoProject.webProjectDemo1.business.abstracts.ProductService;
import demoProject.webProjectDemo1.dataAccess.abstracts.ProductDao;
import demoProject.webProjectDemo1.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductManager implements ProductService {
    private ProductDao productDao;
    @Autowired
    public ProductManager(ProductDao productDao) {

        this.productDao = productDao;
    }


    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
