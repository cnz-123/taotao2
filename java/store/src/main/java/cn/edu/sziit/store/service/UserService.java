package cn.edu.sziit.store.service;

import cn.edu.sziit.store.dao.UserMapper;
import cn.edu.sziit.store.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public int insertUser(User user){
        return userMapper.insertUser(user);
    }

    public String selectUser(String username){
        System.out.println(username);
        return userMapper.selectUser(username);
    }

    public User selectUserByName(String username){
        return userMapper.selectUserByName(username);
    }

}