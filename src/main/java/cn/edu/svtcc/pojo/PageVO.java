package cn.edu.svtcc.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @author demo
 * @title PageVO
 * @description
 * @date 2020/04/25/16:29
 */

public class PageVO<T> implements Serializable {
  private Integer code;
  private String msg;
  private int count;
  private List<T> data;

  public PageVO() {
  }

  //---------------------get 方法------------------------

  public Integer getCode() {
    return code;
  }

  public String getMsg() {
    return msg;
  }

  public int getCount() {
    return count;
  }

  public List<T> getData() {
    return data;
  }


  //---------------------set方法 --------------------------

  public void setCode(Integer code) {
    this.code = code;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public void setData(List<T> data) {
    this.data = data;
  }

  // ------------------toString --------------------

  @Override
  public String toString() {
    return "PageVO{" +
        "code=" + code +
        ", msg='" + msg + '\'' +
        ", count=" + count +
        ", data=" + data +
        '}';
  }
}
