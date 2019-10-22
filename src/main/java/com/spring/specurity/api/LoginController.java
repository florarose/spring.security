package com.spring.specurity.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author liudongting
 * @date 2019/8/19 14:26
 */

@Controller
@RequestMapping("/userLogin")
public class LoginController {

    /**
     * 登录页面
     *
     * @return
     */
    @RequestMapping("")
    public String login() {
        System.out.println("222222222222");
        return "index/login";
    }

    @RequestMapping("index")
    public String index() {
        System.out.println("222222222222");
        return "index/index";
    }
}
