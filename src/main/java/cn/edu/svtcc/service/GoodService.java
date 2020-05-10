package cn.edu.svtcc.service;

import cn.edu.svtcc.pojo.Goods;

import java.util.List;

/**
 * @author demo
 * @title GoodService
 * @description
 * @date 2020/05/10/20:56
 */

public interface GoodService {
  /**
   * 查询所有的商品信息
   * @return
   */
  List<Goods> selectAllGoods();
}
