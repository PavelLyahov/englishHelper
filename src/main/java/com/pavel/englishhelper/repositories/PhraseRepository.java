package com.pavel.englishhelper.repositories;

import com.pavel.englishhelper.models.Phrase;
import org.springframework.data.repository.CrudRepository;

public interface PhraseRepository extends CrudRepository<Phrase, Long> {
}
