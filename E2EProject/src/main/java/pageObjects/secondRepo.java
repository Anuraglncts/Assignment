package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class secondRepo {
	public WebDriver driver;

	By logo = By.xpath("//a[@class='Header-link']");
	By repository = By.xpath("(//a[@class='btn btn-sm btn-primary text-white'])[1]");
	By secondrepo = By.id("repository_name");
	By description=By.xpath("//input[@id='repository_description']");
	By submit = By.xpath("(//button[@type='submit'])[4]");

	public secondRepo(WebDriver driver) {

		this.driver = driver;
		System.out.println("Description added successfully");

	}

	public WebElement getlogo() {
		return driver.findElement(logo);
	}

	public WebElement getrepo() {
		return driver.findElement(secondrepo);
	}

	public WebElement getreepository() {
		return driver.findElement(repository);
	}
	
	public WebElement getdescription() {
		return driver.findElement(description);
	}
	public WebElement getsubmit() {
		return driver.findElement(submit);
	}

}
