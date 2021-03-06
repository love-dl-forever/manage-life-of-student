package com.suyu.api.service;



import com.suyu.api.domain.User;

import java.util.List;

/**
 * @author zwd
 * @date 2018/1/13 16:56
 */
public interface LoginService {

     User login(User user);

    int updateUser(User user);

    List<User> selectUserBynumber(String number);

    User selectById(User user);

    List<User> findAllUser();
}
