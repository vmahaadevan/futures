package com.hundsun.futures.dao;

import java.util.List;

import com.hundsun.futures.entity.Admin;
import com.hundsun.futures.entity.User;

public interface UserMsgDao {
  public List<User> findAllUser(int page,int pageSize);
  public List<Admin> findAllAdmin(int page,int pageSize);
public boolean updateUserById(int id);
public boolean updateUserByUser(User user);
}