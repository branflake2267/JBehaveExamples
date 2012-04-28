package org.gonevertical.test.pages;

import java.util.concurrent.TimeUnit;

import org.gonevertical.test.pages.utils.AbstractPage;
import org.jbehave.web.selenium.WebDriverProvider;

public class Home extends AbstractPage {

  public Home(WebDriverProvider driverProvider) {
    super(driverProvider);
  }

  public void open() {
    get("http://google.com");
    manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

}
