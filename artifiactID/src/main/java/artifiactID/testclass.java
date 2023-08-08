package artifiactID;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   //System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\browser driver\\chrome-win32");
       WebDriverManager.chromedriver().setup();
       ChromeOptions options = new ChromeOptions();
       
       ChromeDriver driver = new ChromeDriver(options);
       
       String baseurl = "https://www.google.com";
       String expectedTitle= "Google";
       
      
       driver.get(baseurl);
       String actualTitle= driver.getTitle();
       
       System.out.print(actualTitle);
       if (actualTitle.equals(expectedTitle)) {
    	   System.out.print("Test Passed");
       } else {
    	   System.out.print("Test failed");
       }
       
       driver.close();
	}

}
