package com.mark.controller;

import com.alibaba.fastjson.JSON;
import com.mark.dao.UserDao;
import com.mark.entity.User;
import com.mark.service.UserService;
import com.mark.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by maliqiang on 2017/2/7.
 */
@Controller("index")
public class IndexController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/",method = RequestMethod.GET,produces = {"application/json; charset=utf-8"})//指定编码，防止返回乱码
    @ResponseBody
    public String index(){
        JsonResult rs = new JsonResult();
        User user = userService.getByUserName("mark");
        if(user!=null){
            rs.setData(user);
            rs.setMsg("操作成功");
        }else {
            rs.setCode(1);
            rs.setSuccess(false);
        }
        //此处并没有使用Jackson配置自动转换成json
        return JSON.toJSONString(rs);
    }
}
