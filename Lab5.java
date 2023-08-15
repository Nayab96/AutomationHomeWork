package Tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab5 {

	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(options);

		Logger logger = Logger.getLogger("Lab5");
		PropertyConfigurator.configure("Log4j.properties");

		String baseurl = "https://www.google.com";
		driver.get(baseurl);
		logger.info("Opened URL");

		String actualTitle = driver.getTitle();
		logger.info("Getting actual Title");

		System.out.print(actualTitle);
		if (actualTitle.equals("Google")) {
			System.out.println(" Test Passed");
			logger.info("Test Passed");

		} else {
			System.out.println(" Test failed");
			logger.info("Test Failed");
		}

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File(".//screenshots//screen.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
