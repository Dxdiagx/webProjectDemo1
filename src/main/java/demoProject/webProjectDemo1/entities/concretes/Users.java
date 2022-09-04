package demoProject.webProjectDemo1.entities.concretes;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;
@NoArgsConstructor
@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;
    @Column(name = "user_name")
    private String name;
    @Column(name = "user_surName")
    private String surName;
    @Column(name = "user_email")
    private String email;
    @Column(name = "user_birthday")
    private Date birthday;


    public Users(int id, String name, String surName, String email, Date birthday) {
        super();
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.birthday = birthday;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
