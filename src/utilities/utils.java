package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class utils {

	
	public static void capturescreen(org.openqa.selenium.WebDriver driver,String str)
	{
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		try {
			FileUtils.copyFile(scrFile, new File("\\test-output\\"+str+".png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
