package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.Log;

public class Guru99 {

	public WebDriver driver;

//	@Test(enabled = false)
	public void SC1_InvalidOldPassword() throws InvalidPropertiesFormatException, IOException{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Selenium\\Workspace\\Guru99\\src\\org\\guru99\\testcases\\datafile.properties");
		prop.loadFromXML(fis);
		prop.getProperty("url");
		
		
		Log.startTestCase("Enter incorrect Old Password");
			
		Log.info("Launch Login Page");
		
		LoginPage loginp=new LoginPage(driver);
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		
		loginp.btnReset.click();
		
		Assert.assertEquals(driver.getTitle(),"Guru99 Bank Manager HomePage");
		
		driver.quit();
		
		Log.endTestCase("End of TestCase");
	}

//	@Test
	public void SC2_ValidPasswordChange(){
		
	/*	String uname="mngr8961";
		String password="nYtAdyg";
		
		Log.startTestCase("Login to Guru99");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		
		Log.info("Launch Login Page");
		
		LoginPage loginp=new LoginPage(driver);
		
		loginp.uid.sendKeys(uname);
		loginp.password.sendKeys(password);
		loginp.btnLogin.click();
		
		Assert.assertEquals(driver.getTitle(),"Guru99 Bank Manager HomePage");
		
		driver.quit();
	*/	
		Log.endTestCase("End of TestCase");
	}
	
//	@Test
	public void SC3_LoginWithNewPassword(){
		
	/*	String uname="mngr8961";
		String password="nYtAdyg";
		
		Log.startTestCase("Login to Guru99");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		
		Log.info("Launch Login Page");
		
		LoginPage loginp=new LoginPage(driver);
		
		loginp.uid.sendKeys(uname);
		loginp.password.sendKeys(password);
		loginp.btnLogin.click();
		
		Assert.assertEquals(driver.getTitle(),"Guru99 Bank Manager HomePage");
		
		driver.quit();
	*/	
		Log.endTestCase("End of TestCase");
	}
	
	@Test
	public void workingwithtable() throws IOException{
			
			System.setProperty("logFilename", "workingwithtables");
		
			Log.startTestCase("Login to Guru99");
			Log.info("info Message");
			Log.error("Error Msg");
			Log.warn("warning Message");
			
//			FirefoxProfile prof = new FirefoxProfile();
	//		prof.setAcceptUntrustedCertificates(false);
			
			
/*			WebDriver driver = new FirefoxDriver(prof);
			driver.get("http://www.espncricinfo.com/ci/engine/match/774883.html");
			
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);			
			FileUtils.copyFile(f, new File("D:\\Selenium\\screenshot.png"));
			
			Log.info("page launched");
			
			WebElement BattingIng=driver.findElement(By.cssSelector(".batting-table.innings"));
			
			List<WebElement> rows=BattingIng.findElements(By.tagName("tr"));
			System.out.println("# of rows"+rows.size());
			
			driver.quit();
*/
			System.out.println("Executing Testcase");
//			Log.endTestCase("End of TestCase");
		}
		
	
	
}
