package com.udacity.jdnd.course1.service;

import com.udacity.jdnd.course1.controller.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    private List<User> userList;

    public UserService(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getUserList(){
        return this.userList;
    }

    public void addUserList(User user){
        userList.add(user);
    }

}
