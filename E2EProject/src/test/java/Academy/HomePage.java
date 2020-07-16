package Academy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.Navigate;
import pageObjects.addComment;
import pageObjects.addEmoji;
import pageObjects.deleteRepo;
import pageObjects.newRepository;
import pageObjects.repositoryName;
import pageObjects.secondRepo;
import resources.base;

public class HomePage extends base{
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();

	}
	@Test
	
	public void basePageNavigation() throws IOException, InterruptedException
	{
		driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		l.getLogin().click(); 
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys("anuraglncts@gmail.com");
		lp.getPassword().sendKeys("Anurag12345@");
		lp.getLogin().click();
		
		newRepository n=new newRepository(driver);
		n.getreepository().click();
		
		repositoryName r=new repositoryName(driver);
		r.getname().sendKeys("loco");
		Thread.sleep(2000);
		r.getsubmit().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		
		secondRepo s=new secondRepo(driver);
		s.getlogo().click();
		s.getreepository().click();
		s.getrepo().sendKeys("locofast");
		s.getdescription().sendKeys("Anuraglncts/locofast");
		Thread.sleep(2000);
		s.getsubmit().click();	
		s.getlogo().click();
		
		addComment a=new addComment(driver);
		a.getsecondreepository().click();
		a.getissues().click();
		a.getcreateissues().click();
		a.getTitle().sendKeys("newIssues");
		a.getsubmitissue().click();
		
		Navigate navi=new Navigate(driver);
		navi.getlogo().click();
		navi.getreepository().click();
		Thread.sleep(2000);
		navi.getlogo1().click();
		
		deleteRepo D=new deleteRepo(driver);
		D.getrepo().click();
		D.getsetting().click();
		Thread.sleep(2000);
		D.getdelete().click();
		Thread.sleep(2000);
		D.getsentdata().sendKeys("Anuraglncts/locofast");
		D.getdeletedata().click();
		
				
		}	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}
	
