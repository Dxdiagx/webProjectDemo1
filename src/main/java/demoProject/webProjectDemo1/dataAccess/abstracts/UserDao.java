package demoProject.webProjectDemo1.dataAccess.abstracts;
import demoProject.webProjectDemo1.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
