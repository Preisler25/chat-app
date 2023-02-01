package preisler.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
    @RequestMapping(value="/map")
    public String trafficSpy() {
        return "index";
    }

    @GetMapping("/view")
    public String viewBooks() {
        return "index";
    }
    @RequestMapping(value="/math")
    public ModelAndView getIndexPage() {
        System.out.println("Alma");
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("text", 11);
        return mav;
    }

}
