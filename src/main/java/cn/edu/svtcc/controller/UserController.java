package cn.edu.svtcc.controller;

import cn.edu.svtcc.pojo.ResultBean;
import cn.edu.svtcc.pojo.Users;
import cn.edu.svtcc.service.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

/**
 * @author demo
 */
@CrossOrigin
@Controller
@SessionAttributes(types = Users.class, value = "user")
@Transactional(rollbackFor = Exception.class)
public class UserController {

  private UserService service;

  @Autowired
  public void setService(UserService service) {
    this.service = service;
  }

  @ResponseBody
  @RequestMapping(value = "/login", method = RequestMethod.POST)

  public ResultBean login(@RequestBody(required = true) String json) {
    Users users = (Users) JSON.parseObject(json, Users.class);

    Users getUser = this.service.login(users);

    return getUser != null ? ResultBean.success(getUser) : ResultBean.fail();

  }

  @ResponseBody
  @RequestMapping(value = "/register", method = RequestMethod.POST)
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
