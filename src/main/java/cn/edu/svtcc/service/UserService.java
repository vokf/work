package cn.edu.svtcc.service;

import cn.edu.svtcc.pojo.Users;

import java.util.List;

/**
 * @author demo
 * @title UserService
 * @description
 * @date 2020/05/01/12:13
 */

public interface UserService {
  List<Users> findAll();

  /**
   *  通过id查询
   * @param userId id
   *
   * @return id
   */
  Users findByUserId(Integer userId);


  Users login(Users users);

  /**
   * 注册
   * @param users user
   */
  void register(Users users);

  /**
   * 更新
   * @param users user
   */
  void updateUser(Users users);

  /**
   * 删除
   * @param ids ids
   */
  void deleteUser(int[] ids);

  /**
   * 查询所有用户
   * @return int
   */
  int findTotalUser();

}
