package cn.edu.svtcc.controller;

import cn.edu.svtcc.pojo.Goods;
import cn.edu.svtcc.service.GoodService;
import cn.edu.svtcc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author demo
 * @title GoodsController
 * @description
 * @date 2020/05/10/21:00
 */

@Controller
public class GoodsController {


  private GoodService service;

  @Autowired
  public void setService(GoodService service) {
    this.service = service;
  }


  @RequestMapping("/hh")
  public String hh(@NonNull Model model) {
    model.addAttribute("demo", service.selectAllGoods());

    return "hh";
  }

  @RequestMapping("/findAllGoods")
  @ResponseBody
  public List<Goods> findAllGoods() {
    return this.service.selectAllGoods();
  }

  @RequestMapping("/index1")
  public String index1(@NonNull Model model) {
    model.addAttribute("abc", service.selectAllGoods());
    model.addAttribute("hot", service.selectGoods());

    return "index";
  }

  //
}
