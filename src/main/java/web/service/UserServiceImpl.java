package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDAO;
import web.model.User;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    public void removeUserById(Integer id) {
        userDAO.removeUserById(id);
    }

    @Override
    public void updateUser(User user, int id) {
        userDAO.updateUser(user, id);
    }

    @Override
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }
}
