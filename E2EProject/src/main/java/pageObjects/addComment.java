package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addComment {

	public WebDriver driver;

	By secondrepos = By.xpath("(//span[text()='Anuraglncts'])[3]");
	By Issues = By.xpath("//span[@data-content='Issues']");
	By createissue = By.xpath("//a[text()='create an issue']");
	By Titlename = By.xpath("//input[@id='issue_title']");
	By submitissue=By.xpath("(//button[@type='submit'])[11]");

	public addComment(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement getsecondreepository() {
		return driver.findElement(secondrepos);
	}

	public WebElement getissues() {
		return driver.findElement(Issues);
	}

	public WebElement getcreateissues() {
		return driver.findElement(createissue);
	}

	public WebElement getTitle() {
		return driver.findElement(Titlename);
	}
	
	public WebElement getsubmitissue() {
		return driver.findElement(submitissue);
	}

}
