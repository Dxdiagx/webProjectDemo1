package demoProject.webProjectDemo1.business.concretes;

import demoProject.webProjectDemo1.business.abstracts.UserService;
import demoProject.webProjectDemo1.core.utilities.results.Result;
import demoProject.webProjectDemo1.core.utilities.results.SuccesResult;
import demoProject.webProjectDemo1.dataAccess.abstracts.UserDao;
import demoProject.webProjectDemo1.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserManager implements UserService {
private UserDao userDao;

@Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAll() {
        return this.userDao.findAll();
    }

    @Override
    public Result add(User users) {
        userDao.save(users);
    return new SuccesResult("Kayıt başarılı...");

    }
}
