package com.bolcom.assignment.models;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

/**
 * Player
 */
@Entity
public class Player {

  @Id
  @GeneratedValue
  private UUID id;

  @NotBlank
  private String name;

  @NotBlank
  private int score;

  @NotBlank
  private int number;

  public Player() {
  }

  public Player(String name, int number) {
    this.name = name;
    this.number = number;
    score = 0;
  }

  public UUID getId() {
    return this.id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getScore() {
    return this.score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public int getNumber() {
    return this.number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

}
