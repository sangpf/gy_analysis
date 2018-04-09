package cn.xdc.controller;

import cn.xdc.utils.AjaxResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.stream.FileImageInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;

@RequestMapping(value = "/user")
@Controller
public class TestController {

    @RequestMapping(value = "/test.do")
    @ResponseBody
    public AjaxResult Test(HttpServletRequest request){
        return AjaxResult.successResult();
    }

    // ----------------------- 测试 session 共享 ----------------------
    @RequestMapping("/test_session_add.do")
    public void test_session_add(HttpServletRequest request){
        HttpSession session = request.getSession();

        long currentTimeMillis = System.currentTimeMillis();
        session.setAttribute("wangfei", "王菲在唱歌"+currentTimeMillis);
    }

    @RequestMapping("/test_session_get.do")
    public void test_session_get(HttpServletRequest request){
        HttpSession session = request.getSession();

        Object userName = session.getAttribute("wangfei");
        System.out.println("--------------------- "+userName);
    }

}
