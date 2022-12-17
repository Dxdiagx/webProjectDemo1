package demoProject.webProjectDemo1.api.controllers;

import demoProject.webProjectDemo1.business.abstracts.ProductService;
import demoProject.webProjectDemo1.core.utilities.results.DataResult;
import demoProject.webProjectDemo1.core.utilities.results.Result;
import demoProject.webProjectDemo1.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
    private ProductService productService;
    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/getall")
    public DataResult<List<Product>> getAll(){
        return this.productService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Product product){
        return this.productService.add(product);
    }
    @GetMapping ("/getByProductName")
    DataResult< Product> getByProductName(String productName){
        return this.productService.getByProductName(productName);
    }
}
