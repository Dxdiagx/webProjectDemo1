package demoProject.webProjectDemo1.business.abstracts;
import demoProject.webProjectDemo1.core.utilities.results.Result;
import demoProject.webProjectDemo1.entities.concretes.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    Result add(User users);
}
