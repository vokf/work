package cn.edu.svtcc.service.impl;

import cn.edu.svtcc.mapper.UserDao;
import cn.edu.svtcc.pojo.Users;
import cn.edu.svtcc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author demo
 * @title UserServiceImpl
 * @description
 * @date 2020/05/01/12:14
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserDao dao;

  public UserServiceImpl() {
  }

  @Override
  public List<Users> findAll() {
    return dao.findAll();
  }

  @Override
  public Users findByUserId(Integer userId) {
    return dao.findByUserId(userId);
  }

  @Override
  public Users login(Users user) {

    return  user.getUserName() != null && user.getPassWord() != null ? this.dao.login(user) : null;

  }

  @Override
  public void register(Users users) {

    this.dao.register(users);
  }

  @Override
  public void updateUser(Users users) {

  }

  @Override
  public void deleteUser(int[] ids) {
    this.dao.deleteUser(ids);
  }

  @Override
  public int findTotalUser() {
    return 0;
  }
}
