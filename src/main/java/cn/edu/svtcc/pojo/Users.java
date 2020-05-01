package cn.edu.svtcc.pojo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * @author demo
 * @title Users
 * @description
 * @date 2020/05/01/12:15
 */
@EqualsAndHashCode(exclude = {"passWord", "phoneNumber","userName"})
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Slf4j
public class Users implements Serializable {
  private Integer userId;
  private String userName;
  private String passWord;
  private String phoneNumber;

  private static final long serialVersionUID = 1L;

}
