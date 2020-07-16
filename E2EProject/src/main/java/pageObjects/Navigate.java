package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navigate {
	public WebDriver driver;

	By logo = By.xpath("//a[@class='Header-link']");
	By navigate = By.xpath("//a[@title='newIssues']");
	By logo1 = By.xpath("//a[@class='Header-link']");


	public Navigate(WebDriver driver) {

		this.driver = driver;
		System.out.println("navigation is successfull");
		System.out.println("we are on Home Page");
		System.out.println(" Assignment success");

	}

	public WebElement getreepository() {
		return driver.findElement(navigate);

	}

	public WebElement getlogo() {
		return driver.findElement(logo);

	}
	
	public WebElement getlogo1() {
		return driver.findElement(logo1);

	}

	

}
