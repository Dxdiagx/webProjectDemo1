package demoProject.webProjectDemo1.business.concretes;
import demoProject.webProjectDemo1.business.abstracts.ProductService;
import demoProject.webProjectDemo1.core.utilities.results.DataResult;
import demoProject.webProjectDemo1.core.utilities.results.Result;
import demoProject.webProjectDemo1.core.utilities.results.SuccesDataResult;
import demoProject.webProjectDemo1.core.utilities.results.SuccesResult;
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
    public DataResult< List<Product>> getAll() {
        return new SuccesDataResult<List<Product>>
       ("Data Listelendi",this.productDao.findAll());

    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);

        return new SuccesResult("Ürün eklendi");
    }

    @Override
    public DataResult<Product> getByProductName(String productName) {
        return new SuccesDataResult<Product>
                ("Data Listelendi",this.productDao.getByProductName(productName));
    }

    @Override
    public DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId) {
        return new SuccesDataResult<Product>
                ("Data Listelendi",this.productDao.getByProductNameAndCategoryId(productName,categoryId));
    }

    @Override
    public DataResult<List<Product>> getByProductNameOrCategoryName(String productName, String categoryName) {
        return new SuccesDataResult<List<Product>>
                ("Data Listelendi",this.productDao.getByProductNameOrCategoryName(productName,categoryName));
    }

    @Override
    public DataResult<List<Product>> getByProductNameContains(String productName) {
        return new SuccesDataResult<List<Product>>
                ("Data Listelendi",this.productDao.getByProductNameContains(productName));
    }

    @Override
    public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
        return new SuccesDataResult<List<Product>>
                ("Data Listelendi",this.productDao.getByProductNameStartsWith(productName));
    }
}
