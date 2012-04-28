package org.gonevertical.test.steps;

import org.gonevertical.test.pages.Pages;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleSearchTestSteps {

  private final Pages pages;

  public GoogleSearchTestSteps(Pages pages) {
    this.pages = pages;
  }

  @Given("user is on Google")
  public void userIsOnHomePage(){        
    pages.home().open();        
  }

  @When("search input exists")
  public void searchInputExists() {
    pages.home().findElement(By.name("q"));
  }
  
  @Then("search for \"$text\"")
  public void searchFor(String text) {
    WebElement element = pages.home().findElement(By.name("q"));
    element.sendKeys(text);
  }
  
}
