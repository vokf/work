package cn.edu.svtcc.controller;

import cn.edu.svtcc.pojo.ResultBean;
import cn.edu.svtcc.pojo.Users;
import cn.edu.svtcc.service.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author demo
 */
@CrossOrigin
@Controller
@SessionAttributes(types = ResultBean.class)
@Transactional(rollbackFor = Exception.class)
public class UserController {


  private UserService service;
  @Autowired
  public void setService(UserService service) {
    this.service = service;
  }

  @ResponseBody
  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public ResultBean login(@NonNull@RequestBody(required = true) String json,@NonNull HttpServletRequest request) {
    //将从页面传来的json转换成users
    Users users = (Users) JSON.parseObject(json, Users.class);
    //调用service层的login方法
    Users getUser = this.service.login(users);
    //通过resultBean中的success方法 或者 fail 方法 给前端响应
    ResultBean bean = getUser != null ? ResultBean.success(getUser) : ResultBean.fail();
    //将用户的登录信息保存在session中
    request.getSession().setAttribute("user_login",bean);

    return bean ;

  }
  @ResponseBody
  @RequestMapping(value = "/register", method = RequestMethod.POST)
  public ResultBean register(@RequestBody String json) {
    Users users = (Users) JSON.parseObject(json, Users.class);

    this.service.register(users);
    return ResultBean.success();
  }

  @RequestMapping("/index")
  public String index( @NonNull HttpServletRequest request) {

    Object user_login = request.getSession().getAttribute("user_login");
    System.out.println(user_login);
    return "userLogin.html";
  }
}
