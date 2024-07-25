package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

//Mark this classes as a spring mvc controller.
@Controller
public class JokeController {
// Filed  to hold the jockservice  instance.
    private final JokeService jokeService;
// // Constructor to initialize the jokeService field
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    // Handles requests to the root URL ("/" or "")
    @RequestMapping({"/" , ""})
    public String showJoke (Model model){
        // Adds a joke to the model attribute
        model.addAttribute("joke" , jokeService.getJoke());
        // Returns the name of the view to be rendered (index)
        return "index";
    }
}
