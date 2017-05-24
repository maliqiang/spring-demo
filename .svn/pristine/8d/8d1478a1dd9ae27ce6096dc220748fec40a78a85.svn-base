package com.mark.controller;

import com.alibaba.fastjson.JSON;
import com.mark.util.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by maliqiang on 2017/2/7.
 */
@RestController("index")
public class IndexController {
    @RequestMapping(value = "/",method = RequestMethod.GET,produces = {"application/json; charset=utf-8"})
    @ResponseBody
    public String index(){
        JsonResult rs = new JsonResult();
        rs.setMsg("操作成功");
        return JSON.toJSONString(rs);
    }
}
