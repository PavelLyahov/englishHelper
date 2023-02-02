package com.pavel.englishhelper.controllers;

import com.pavel.englishhelper.models.Phrase;
import com.pavel.englishhelper.repositories.PhraseRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/phrases")
public class PhraseController {

    private final PhraseRepository phraseRepository;

    public PhraseController(PhraseRepository phraseRepository) {
        this.phraseRepository = phraseRepository;
    }

    @PostMapping
    public void storePhrase(@RequestBody Phrase phrase) {
        phraseRepository.storePhrase(phrase);
    }

    @GetMapping
    public List<Phrase> findPhrases() {
        return phraseRepository.findAllPhrases();
    }

}
