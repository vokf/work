package cn.edu.svtcc.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author demo
 * @title PageVO
 * @description
 * @date 2020/04/25/16:29
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
public class PageVO<T> implements Serializable {
  private Integer code;
  private String msg;
  private Integer count;
  private List<T> data;

}
