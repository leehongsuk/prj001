package first.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class CrunchifyHelloWorld {
 
    @RequestMapping("/welcome.do")
    public ModelAndView helloWorld() {
 
        String message = "<br><div style='text-align:center;'>"
                + "<h3Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java 한글..!!@$$%&</div><br><br>";
        return new ModelAndView("welcome", "message", message);
    }
}