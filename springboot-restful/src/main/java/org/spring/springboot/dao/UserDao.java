package org.spring.springboot.dao;

import org.spring.springboot.domain.User;

import java.util.List;

public interface UserDao {
    /**
     * 新增用户
     * @param user
     * @return
     */
    Long saveUser(User user);

    /**
     * 查询用户列表
     * @return
     */
    List<User> getUsers();

    /**
     * 根据用户名和密码查询用户
     * @param userName
     * @param passWord
     * @return
     */
    User findUser(String userName,String passWord);
}
