package com.pavel.englishhelper.controllers;

import com.pavel.englishhelper.models.Phrase;
import com.pavel.englishhelper.repositories.PhraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PhraseController {

    @Autowired
    private PhraseRepository phraseRepository;

    @GetMapping("/phrases")
    public String showPhrasesPage(Model model) {
        return "/phrases";
    }

    @PostMapping("/phrases")
    public void addPhrase(@RequestParam String targetPhrase, @RequestParam String nativePhrase) {
        Phrase phrase = new Phrase(targetPhrase, nativePhrase);
        phraseRepository.save(phrase);
    }

}
