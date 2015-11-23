package hello;

/**
 * Created by shenlijun on 2015/11/23.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;


@Controller
@RequestMapping(value = "welcome")
public class HelloController {

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public  String hello(ModelMap modelMap) {
        System.out.println("luoluo zhenbang");
        modelMap.addAttribute("message", "spring mvc  hello world");
        modelMap.addAttribute("luoluo", "luoluo's hello world");
        modelMap.addAttribute("ningwawa","zhutou");
        modelMap.addAttribute("shenlifei","zhongzhongda");
        return  "hello";
    }
}
