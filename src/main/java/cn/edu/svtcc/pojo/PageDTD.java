package cn.edu.svtcc.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author demo
 * @title PageDTD
 * @description 要进行分页设计的
 * @date 2020/04/25/16:28
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
public class PageDTD<T> implements Serializable {
  /**
   * 页面
   */
  private Integer page;
  /**
   * limit
   */
  private Integer limit;
  /**
   * condition 条件
   */
  private T condition;


}
