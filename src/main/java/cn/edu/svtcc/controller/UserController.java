package cn.edu.svtcc.controller;

import cn.edu.svtcc.pojo.ResultBean;
import cn.edu.svtcc.pojo.Users;
import cn.edu.svtcc.service.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
  @Autowired
  UserService service;

  @ResponseBody
  @RequestMapping(value = "/login",method = RequestMethod.POST)
  public ResultBean login(@RequestBody(required = true) String json) {
    Users users = (Users) JSON.parseObject(json, Users.class);
    System.out.println(users);
    Users getUser = this.service.login(users);
    return getUser != null ? ResultBean.success(getUser) : ResultBean.fail();

  }

  @ResponseBody
  @RequestMapping(value = "/register",method = RequestMethod.POST)
  public ResultBean register(@RequestBody String json) {
    Users users = (Users) JSON.parseObject(json, Users.class);

    this.service.register(users);
    return ResultBean.success();
  }

  @RequestMapping("/index")
  public String index() {

    return "userLogin.html";
  }
}
