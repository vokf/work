package cn.edu.svtcc.mapper;

import cn.edu.svtcc.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author demo
 * @title GoodsDao
 * @description
 * @date 2020/05/10/20:41
 */

@Mapper
public interface GoodsDao {

  /**
   * 查询所有商品
   *
   * @return 商品集合
   */
  @Select("select * from goods")
  @Results({
      @Result(column = "good_name", property = "goodName"),
      @Result(column = "good_price", property = "goodPrice"),
      @Result(column = "good_image", property = "goodImage"),
      @Result(column = "hot", property = "hotGood")
  })
  List<Goods> selectAllGoods();

}
