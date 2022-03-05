package nl.utwente.soa.sampleWebapplication.web;

import nl.utwente.soa.sampleWebapplication.services.StaticMovieService;
import nl.utwente.soa.sampleWebapplication.services.XmlMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // Todo: Update this to use the XML movieservice instead of the static movie service
    @Autowired private XmlMovieService movieService;

    @GetMapping("/")
    public String showMovies(Model model) {

        model.addAttribute("movies", movieService.getMovies());

        return "show-movies";
    }
}
