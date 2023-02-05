package com.pavel.englishhelper.controllers;

import com.pavel.englishhelper.models.Phrase;
import com.pavel.englishhelper.repositories.PhraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrainingController {

    @Autowired
    private PhraseRepository phraseRepository;

    @GetMapping("/training")
    public String training(Model model) {
        Iterable<Phrase> phrases = phraseRepository.findAll();
        model.addAttribute("phrases", phrases);
        return "training";
    }
}
