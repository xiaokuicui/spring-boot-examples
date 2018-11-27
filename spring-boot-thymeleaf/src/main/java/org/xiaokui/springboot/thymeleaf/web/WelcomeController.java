package org.xiaokui.springboot.thymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaokui
 * @Description:
 * @date 2018-04-24 23:21
 */
@Controller
public class WelcomeController {

    @RequestMapping("/index")
    public String welcome(ModelMap model) {
        model.put("message", "Hello Thymeleaf!");
        return "index";
    }
}
