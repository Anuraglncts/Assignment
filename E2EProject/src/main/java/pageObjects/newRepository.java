package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class newRepository {
	public WebDriver driver;

	By newrepository = By.xpath("(//a[@class='btn btn-sm btn-primary text-white'])[1]");

	public newRepository(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement getreepository() {
		return driver.findElement(newrepository);
	}

}
