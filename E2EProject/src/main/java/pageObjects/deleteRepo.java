package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class deleteRepo {
	public WebDriver driver;

	By secondrepos = By.xpath("(//span[text()='Anuraglncts'])[3]");
	By setting = By.xpath("//span[@data-content='Settings']");
	By delete=By.xpath("(//summary[@role='button'])[10]");
	By senddata=By.xpath("(//input[@class='form-control input-block'])[4]");
	By DeleteData=By.xpath("//button[text()='I understand the consequences, delete this repository']");

	public deleteRepo(WebDriver driver) {

		this.driver = driver;
		System.out.println("repository deleted success");

	}

	public WebElement getrepo() {
		return driver.findElement(secondrepos);

	}

	public WebElement getsetting() {
		return driver.findElement(setting);

	}
	public WebElement getdelete() {
		return driver.findElement(delete);

	}
	public WebElement getsentdata() {
		return driver.findElement(senddata);

	}
	public WebElement getdeletedata() {
		System.out.println("delted success");
		return driver.findElement(DeleteData);

	}

}
