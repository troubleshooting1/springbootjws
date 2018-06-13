package com.anji.springbootjwt.service;




import com.anji.springbootjwt.model.UserInfo;

import java.util.List;

/**
 * Description:
 * author: chenqiang
 * date: 2018/6/12 10:27
 */
public interface UserService {

    public void saveUser(UserInfo userInfo);

    public UserInfo findOne(String appid);

    public void delete(long id);

    public List<UserInfo> findByName(String name);
}