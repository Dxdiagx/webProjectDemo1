package demoProject.webProjectDemo1.entities.concretes;
import lombok.NoArgsConstructor;
import javax.persistence.*;
@Entity
@Table(name = "product")
@NoArgsConstructor
public class Product {
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
    private double netPrice;


    public Product(int id, String productName, double unitPrice, String webAdress, String webAdressName, int discount, double netPrice) {

        this.id = id;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.webAdress = webAdress;
        this.webAdressName = webAdressName;
        this.discount = discount;
        this.netPrice = netPrice;
    }
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
        return netPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }
}
