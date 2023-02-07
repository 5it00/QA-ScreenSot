package TakeScreen;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Screen_Shot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver", "D:\\MicrosoftDriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https:\\www.facebook.com");
		//to avoid lost screens every time we have to put date 
	Date curentDate = new Date(); //do not import date from sql
		//we have : this problem while naming files so we have to avoid it by making string variable and replace it with any char.
		String acutalDate = curentDate.toString().replace(":", "-");
		//lets take screenshot for my url
		TakesScreenshot src = ((TakesScreenshot) driver);
		//take it as an output and put it into file
		File srcfile = src.getScreenshotAs(OutputType.FILE);
		//put file into destination  with file name or  it's source
		File dest  = new File (".\\driversscreens"+acutalDate+".png");
		//now i can use file to do what i want 
		FileUtils.copyFile(srcfile, dest);
		

	}

}
