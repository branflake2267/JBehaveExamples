package org.gonevertical.test.pages;

import org.jbehave.web.selenium.WebDriverProvider;

public class Pages {

  private final WebDriverProvider driverProvider;

  private Home home;

  public Pages(WebDriverProvider driverProvider) {
    this.driverProvider = driverProvider;
  }

  public Home home(){
    if ( home == null ){
      home = new Home(driverProvider);
    }
    return home;
  }

}
