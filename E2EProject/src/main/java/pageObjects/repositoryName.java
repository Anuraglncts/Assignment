package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class repositoryName {
	
	public WebDriver driver;

	By repository = By.id("repository_name");
	By submit = By.xpath("//button[@class='btn btn-primary first-in-line']");

	public repositoryName(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement getname() {
		return driver.findElement(repository);
	}

	public WebElement getsubmit() {
		return driver.findElement(submit);
	}
	
	

}
