package com.greenfox.tamagoci.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by Viktor on 2017-05-04.
 */
@Getter
@Setter
@Component
public class Fox {

  private String name;
  String actualFood = "sallad";
  String actualDrink = "water";
  List<String> listOfTricks = new ArrayList<>();

  List<String> listOfTricksToLearn = new ArrayList<>(Arrays.asList("Make coffee", "Do backflip", "Wash dishes"));
  List<String> listOfFoods;
  List<String> listOfDrinks;

  public Fox() {
    this.name = "Mr. Green";
    listOfTricks = new ArrayList<>();
    this.actualFood = getActualFood();
    this.actualDrink = getActualDrink();
  }

  public void addTrick(String input) {
    listOfTricks.add(input);
  }

  public void addNewTrick(String trick) {
    listOfTricksToLearn.add(trick);
  }
}
