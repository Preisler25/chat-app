package preisler.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
    @RequestMapping(value="/")
    public ModelAndView getIndexPage() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("text", "Message of the day");
        return mav;
    }

}
