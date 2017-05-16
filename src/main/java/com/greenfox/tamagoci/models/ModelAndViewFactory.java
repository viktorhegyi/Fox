package com.greenfox.tamagoci.models;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Viktor on 2017-05-04.
 */
@Component
public class ModelAndViewFactory {

  public ModelAndView getModelAndView() {
    return new ModelAndView();
  }

}
