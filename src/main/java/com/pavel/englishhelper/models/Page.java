package com.pavel.englishhelper.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Page {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min=2, message="File must be at least 2 characters long")
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Phrase> phrases = new ArrayList<>();

    public void addPhrase(Phrase phrase) {
        this.phrases.add(phrase);
    }
}
