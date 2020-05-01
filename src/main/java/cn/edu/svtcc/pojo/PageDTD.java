package cn.edu.svtcc.pojo;

import java.io.Serializable;

/**
 * @author demo
 * @title PageDTD
 * @description 要进行分页设计的
 * @date 2020/04/25/16:28
 */

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


  /**
   * 构造函数 无参
   */
  public PageDTD() {
  }

  //-------------------get 方法----------------------

  public Integer getPage() {
    return page;
  }

  public Integer getLimit() {
    return limit;
  }

  public T getCondition() {
    return condition;
  }

  //------------set方法 ---------------------

  public void setPage(Integer page) {
    this.page = page;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public void setCondition(T condition) {
    this.condition = condition;
  }

  // ------------------toString --------------------

  @Override
  public String toString() {
    return "PageDTO{" +
        "page=" + page +
        ", limit=" + limit +
        ", condition=" + condition +
        '}';
  }

}
