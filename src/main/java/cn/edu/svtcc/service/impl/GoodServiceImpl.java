package cn.edu.svtcc.service.impl;

import cn.edu.svtcc.mapper.GoodsDao;
import cn.edu.svtcc.pojo.Goods;
import cn.edu.svtcc.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author demo
 * @title GoodServiceImpl
 * @description
 * @date 2020/05/10/20:57
 */
@Service("GoodService")
@Transactional(rollbackFor = Exception.class)
public class GoodServiceImpl implements GoodService {

  private GoodsDao dao;

  @Autowired
  public void setDao(GoodsDao dao) {
    this.dao = dao;
  }

  @Override
  public List<Goods> selectAllGoods() {
    return dao.selectAllGoods();
  }
}
