package cn.edu.svtcc.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author demo
 * @title Goods
 * @description
 * @date 2020/05/10/20:39
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Goods implements Serializable {
  private static final long serialVersionUID = 1L;
  private Integer id;
  private String goodName;
  private Integer goodPrice;
  private String goodImage;
  private String hotGood;

}
