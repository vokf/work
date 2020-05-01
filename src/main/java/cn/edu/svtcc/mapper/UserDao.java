package cn.edu.svtcc.mapper;

import cn.edu.svtcc.pojo.Users;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import java.util.List;

/**
 * @author demo
 * @title UserDao
 * @description
 * @date 2020/05/01/12:14
 */
@Mapper
public interface UserDao {
  @Select("select * from user")
  List<Users> findAll();

  /**
   * 通过userId查询用户
   *
   * @param userId userId
   * @return user
   */
  @Select("select * from user where userId = #{userId} ")
  Users findByUserId(@Param("userId") Integer userId);


  @Select("select *from user u where u.userName=#{userName} && u.passWord=#{passWord}")
  Users login(Users users);

  /**
   * 注册用户
   *
   * @param users user
   */
  @Insert({"insert into user(userId,userName,passWord,phoneNumber) values (null,#{userName},#{passWord},#{phoneNumber} )"})
  void register(Users users);

  /**
   * 更新用户信息
   *
   * @param users users
   */
  @Update("update user set userId = #{userId},userName = #{userName},passWord = #{passWord},phoneNumber = #{phoneNumber}")
  void updateUser(Users users);

  /**
   * 删除用户
   *
   * @param ids id
   *
   */
  @Delete("delete from user where userId =#{userId}")
  void deleteUser(int[] ids);

  /**
   * 查询用户总的数量
   *
   * @return 数量
   */
  @Select("select count(*) from user")
  int findTotalUser();

}
