package com.pavel.englishhelper.services;

import com.pavel.englishhelper.models.Phrase;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhraseService {

  private List<Phrase> phraseList = new ArrayList<>();

  public void addPhrase(Phrase phrase) {
    phraseList.add(phrase);
  }

  public List<Phrase> getPhrases() {
    return phraseList;
  }

}
