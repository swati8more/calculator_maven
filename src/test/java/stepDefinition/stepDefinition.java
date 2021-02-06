package stepDefinition;

import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.Main_Page;
import resources.base;


public class stepDefinition extends base{

    @Given("^Initialise the chrome browser$")
    public void initialise_the_chrome_browser() throws Throwable {
        
        driver =initilaseDriver();

    }

    @And("^Navigate to site$")
    public void navigate_to_site() throws Throwable {
        driver.get("https://www.calculator.net/" );
       
    }

    @Given("^User do calucation by multiplying two values$")
    public void user_do_calucation_by_multiplying_two_values() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	Main_Page m=new Main_Page(driver);
    	Actions builder = new Actions(driver);  
    	builder.moveToElement(m.getin(), 67, 83).sendKeys("423*525").build().perform();
    	m.equalto().click();
    	System.out.println("Multiplication is:"+m.getout().getText());
      
    }

    @Given("^User do calculation by dividing two values$")
    public void user_do_calculation_by_dividing_two_values() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	Main_Page m=new Main_Page(driver);
    	Actions builder = new Actions(driver);  
    	builder.moveToElement(m.getin(), 67, 83).sendKeys("4000/200").build().perform();
    	m.equalto().click();
    	System.out.println("Division is:"+m.getout().getText());
      
        
    }

    @Given("^User do calucation by adding two values$")
    public void user_do_calucation_by_adding_two_values() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	Main_Page m=new Main_Page(driver);
    	Actions builder = new Actions(driver);  
    	builder.moveToElement(m.getin(), 67, 83).sendKeys("-234234+345345").build().perform();
    	m.equalto().click();
    	System.out.println("Addition is:"+m.getout().getText());
    }

    @Given("^User do calculation by substracting two values$")
    public void user_do_calculation_by_substracting_two_values() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	Main_Page m=new Main_Page(driver);
    	Actions builder = new Actions(driver);  
    	builder.moveToElement(m.getin(), 67, 83).sendKeys("234823-23094823").build().perform();
    	m.equalto().click();
    	System.out.println("Subtraction is:"+m.getout().getText());
        
    }

    @Then("^close the browsers$")
    public void close_the_browsers() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
        driver.quit();
    }


}