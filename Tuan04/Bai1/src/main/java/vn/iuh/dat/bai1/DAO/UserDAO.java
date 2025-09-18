package vn.iuh.dat.bai1.DAO;

import vn.iuh.dat.bai1.Entity.User;

import java.util.ArrayList;

public interface UserDAO {
    public void addUser(User user);
    public ArrayList<User> getAllUsers();
}
