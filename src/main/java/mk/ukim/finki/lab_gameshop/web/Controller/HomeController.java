package mk.ukim.finki.lab_gameshop.web.Controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/","/home"})
public class HomeController {
    @GetMapping
    public String getHomePage(Model model){
        return "master-template";
    }
    @GetMapping("/access_denied")
    public String getAccessDeniedPage(org.springframework.ui.Model model) {
        model.addAttribute("bodyContent", "access_denied");
        return "master-template";
    }
}
