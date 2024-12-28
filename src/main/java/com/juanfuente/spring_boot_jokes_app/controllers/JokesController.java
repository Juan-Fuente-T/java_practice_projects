package com.juanfuente.spring_boot_jokes_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.juanfuente.spring_boot_jokes_app.services.JokeService;

@Controller
public class JokesController {
//    private final JokesRepository jokesRepository;
//    private final ChuckNorrisQuotes chuckNorrisQuotes;
    private final JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

//    @RequestMapping("/jokes")
    @RequestMapping({"/", ""})
    public String getJoke(Model model) {

//        model.addAttribute("joke", jokesRepository.findAll());//

//          model.addAttribute("jokes", this.jokes);//
            model.addAttribute("joke", jokeService.getJoke());
                return "index";
//        return "jokes/list";
    }
}
