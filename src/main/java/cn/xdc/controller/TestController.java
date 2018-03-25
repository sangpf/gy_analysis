package cn.xdc.controller;

import cn.xdc.utils.AjaxResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    @RequestMapping(value = "/test.do")
    @ResponseBody
    public AjaxResult Test(HttpServletRequest request){

        return AjaxResult.successResult();
    }

}
