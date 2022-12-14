package demoProject.webProjectDemo1.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import demoProject.webProjectDemo1.entities.abstracts.EntityService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Table(name = "category")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","product"})
public class Category implements EntityService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="category_id")
    private int categoryId;
    @Column(name="category_name")
    private String categoryName;
    @OneToMany(mappedBy = "category")
    private List<Product> products;

    public Category(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


}
