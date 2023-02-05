package com.pavel.englishhelper.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Phrase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min=2, message="Phrase must be at least 5 characters long")
    private String targetPhrase;

    @NotNull
    @Size(min=2, message="Phrase must be at least 5 characters long")
    private String nativePhrase;

    public Phrase(String targetPhrase, String nativePhrase) {
        this.targetPhrase = targetPhrase;
        this.nativePhrase = nativePhrase;
    }
}
