package demoProject.webProjectDemo1.entities.concretes;
import demoProject.webProjectDemo1.entities.abstracts.EntityService;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;
@NoArgsConstructor
@Entity
@Data
@Table(name = "users")
public class User implements EntityService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;
    @Column(name = "user_name")
    private String name;
    @Column(name = "user_surname")
    private String surName;
    @Column(name = "user_email")
    private String email;
    @Column(name = "user_birthday")
    private Date birthday;
    @Column(name="user_phone_number")
    private String phoneNumber;

    @Column(name="user_password")
    private String password;
    public User(int id, String password,String name, String surName, String email, Date birthday, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.password=password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
