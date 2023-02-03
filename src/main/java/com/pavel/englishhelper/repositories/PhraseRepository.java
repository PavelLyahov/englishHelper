package com.pavel.englishhelper.repositories;

import com.pavel.englishhelper.models.Phrase;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PhraseRepository {

  private final JdbcTemplate jdbc;

  public PhraseRepository(JdbcTemplate jdbc) {
    this.jdbc = jdbc;
  }

  public void storePhrase(Phrase phrase) {
    String sql = "INSERT INTO phrases VALUES (NULL, ?, ?)";
    jdbc.update(sql, phrase.getTargetPhrase(), phrase.getNativePhrase());
  }

  public List<Phrase> findAllPhrases() {
    String sql = "SELECT * FROM phrases";

    RowMapper<Phrase> phraseRowMapper = (r, i) -> {
      Phrase rowObject = new Phrase();
      rowObject.setId(r.getLong("id"));
      rowObject.setTargetPhrase(r.getString("targetPhrase"));
      rowObject.setNativePhrase(r.getString("nativePhrase"));
      return rowObject;
    };

    return jdbc.query(sql, phraseRowMapper);
  }
}
