package com.alex.SpringBoot.services;


import com.alex.SpringBoot.models.User;

import java.util.List;

public interface UserService {

    public List<User> showAllUsers();

    public void saveOrUpdateUser(User user);

    public User showUser(int id);

    public void deleteUser(int id);
}
