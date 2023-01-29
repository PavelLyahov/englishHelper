package com.pavel.englishhelper.controllers;

import com.pavel.englishhelper.models.Phrase;
import com.pavel.englishhelper.services.PhraseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PhraseController {

    private final PhraseService phraseService;

    public PhraseController(PhraseService phraseService) {
        this.phraseService = phraseService;
    }

    @RequestMapping("/phrases")
    public String viewPhrases(Model model) {
        var phrases = phraseService.getPhrases();
        model.addAttribute("phrases", phrases);
        return "phrases.html";
    }

    @PostMapping("/phrases")
    public String addPhrase(Phrase phrase, Model model) {
        phraseService.addPhrase(phrase);
        var phrases = phraseService.getPhrases();
        model.addAttribute("phrases", phrases);
        return "phrases.html";
    }

}
