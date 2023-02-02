package preisler.main;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
    @RequestMapping(value="/", method = RequestMethod.GET)
    public ModelAndView getIndexPage() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("text", "Message of the day");
        return mav;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody String temp, HttpServletResponse response){

        String username = getData(temp, 0);
        String password = getData(temp, 1);
        String email = getData(temp, 2);

        String query = "";

        //Redirecting the user to the /main page
        response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
        response.setHeader("Location", "/main");
        return "redirect:/main";

    }

    private String getData(String data, int id) {return data.split("&")[id].split("=")[1];}


}
