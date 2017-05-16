package com.greenfox.tamagoci.controller;

import com.greenfox.tamagoci.models.Fox;
import com.greenfox.tamagoci.models.ModelAndViewFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Viktor on 2017-05-04.
 */
@Controller
public class MainController {

  @Autowired
  Fox fox;
  @Autowired
  ModelAndViewFactory modelAndViewFactory;

  @RequestMapping("/")
  public ModelAndView index() {
    ModelAndView m = modelAndViewFactory.getModelAndView();
    m.setViewName("index");
    m.addObject("fox", fox);
    return m;
  }

  @RequestMapping("/nutritionStore")
  public ModelAndView nutritionStore() {
    ModelAndView m = modelAndViewFactory.getModelAndView();
    m.setViewName("nutritionstore");
    return m;
  }

  @RequestMapping("/changeNutrition")
  public ModelAndView changeNutrition(String food, String drink) {
    ModelAndView m = modelAndViewFactory.getModelAndView();
    m.addObject("fox", fox);
    fox.setActualFood(food);
    fox.setActualDrink(drink);
    m.setViewName("/index");
    return m;
  }

  @RequestMapping("/trickCenter")
  public ModelAndView trickCenter() {
    ModelAndView m = modelAndViewFactory.getModelAndView();
    m.addObject("fox", fox);
    m.setViewName("/trickCenter");
    return m;
  }

  @RequestMapping("/addTricks")
  public ModelAndView addTricks(@RequestParam String trick) {
    ModelAndView m = modelAndViewFactory.getModelAndView();
    m.addObject("fox", fox);
    fox.addTrick(trick);
    for (int i = 0; i <fox.getListOfTricksToLearn().size() ; i++) {
      int index;
      if (trick.equals(fox.getListOfTricksToLearn().get(i))) {
        index = i;
        fox.getListOfTricksToLearn().remove(index);
      }
    }
    m.setViewName("index");
    return m;
  }

  @RequestMapping("/addNewTricks")
  public ModelAndView addNewTrick(@RequestParam String trick) {
    ModelAndView m = modelAndViewFactory.getModelAndView();
    m.addObject("fox", fox);
    fox.addNewTrick(trick);
    m.setViewName("trickCenter");
    return m;
  }
}
