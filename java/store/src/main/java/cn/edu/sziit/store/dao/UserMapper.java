package cn.edu.sziit.store.dao;


import cn.edu.sziit.store.model.User;

import java.util.List;

public interface UserMapper {
    int insertUser(User user);
    String selectUser(String username);
    User selectUserByName(String username);
}