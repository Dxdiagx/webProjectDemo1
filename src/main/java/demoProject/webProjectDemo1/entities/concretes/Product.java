package demoProject.webProjectDemo1.entities.concretes;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import demoProject.webProjectDemo1.entities.abstracts.EntityService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
@Entity
@Table(name = "product")
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","category"})
public class Product implements EntityService {
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_unit_price")
    private double unitPrice;

    @Column(name = "product_web_adress")
    private String webAdress;

    @Column(name = "product_web_adress_name")
    private String webAdressName;
    @Column(name = "product_discount")
    private int discount;
    @Column(name = "product_net_price")
    private double netPrice=0;


    @ManyToOne
    @JoinColumn(name="product_category_id")
     private Category category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getWebAdressName() {
        return webAdressName;
    }


    public void setWebAdressName(String webAdressName) {
        this.webAdressName = webAdressName;
    }

    public String getWebAdress() {
        return webAdress;
    }

    public void setWebAdress(String webAdress) {
        this.webAdress = webAdress;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public double getNetPrice() {
        return getUnitPrice()-(getUnitPrice()*discount/100);
    }

    public void setNetPrice(double netPrice) {

        this.netPrice = unitPrice;
    }
}
