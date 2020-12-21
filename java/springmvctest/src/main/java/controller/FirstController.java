package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class FirstController {
    @RequestMapping("/first")
    public String helloWorld(Model model){
        //向模型对象中添加数据
        model.addAttribute("message","my first soring mvc app!");
        //返回视图名
        return "first";
    }
}
