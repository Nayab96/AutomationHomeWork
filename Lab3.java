package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   WebDriverManager.chromedriver().setup();
	       ChromeOptions options = new ChromeOptions();
	       ChromeDriver driver = new ChromeDriver(options);
	   
	       String baseurl = "https://omayo.blogspot.in/";
	       driver.get(baseurl);
	       
	       WebElement field_1 = driver.findElement(By.xpath("//textarea[contains(@id,'ta')]"));
	       field_1.clear();
	       String input = "Nayab Gul";
	       field_1.sendKeys(input);
	       String output = field_1.getAttribute("value");
	       
	       if (input.equals(output)) {
	    	   System.out.print("\nTest Passed");
	       } 
	       else {
	    	   System.out.print("\nTest Failed");
	       }
	       //check field2 xpath
	       WebElement field_2 =driver.findElement(By.xpath("//div[contains(@id,'HTML')]//div[@class='widget-content']//textarea[@cols='30']"));
	       field_2.clear();
	       String input2 = "Nayab Gul";
	       field_2.sendKeys(input);
	       String output2 = field_2.getAttribute("value");
	       
	       if (input2.equals(output2)) {
	    	   System.out.print("\nTest Passed");
	       } 
	       else {
	    	   System.out.print("\nTest Failed");
	       }
	       
	       List<WebElement> List_Head = driver.findElements(By.xpath("//table[contains(@id,'table')]//thead//tr//th")); 
	       List<WebElement> List_Body = driver.findElements(By.xpath("//table[contains(@id,'table')]//tbody//tr"));
	       WebElement head;
	       WebElement body;
           
	       
	       for (int z=0;z<List_Head.size();z++) {
	    	   head= List_Head.get(z);
	    	   System.out.print("\n" + head.getText());
	      }
	       
	       
	       for (int i=0;i<=List_Body.size();i++) {
	    	   List<WebElement> ListBody1 = driver.findElements(By.xpath("//table[contains(@id,'table')]//tbody//tr["+ i +"]//td"));
	    	   for (int j=0;j<ListBody1.size();j++) {
		    	   body = ListBody1.get(j);
		    	   System.out.print("\n" + body.getText());
		       }
	       }
	      
	       WebElement user_name = driver.findElement(By.xpath("//form[@name='login']//input[@name='userid']"));
	       String input3 = "NayabGul";
	       user_name.sendKeys(input3);
	       String output3 = user_name.getAttribute("value");
	       
	       if (input3.equals(output3)) {
	    	   System.out.print("\nTest Passed");
	       } 
	       else {
	    	   System.out.print("\nTest Failed");
	       }
	       
	       WebElement password_ = driver.findElement(By.xpath("//form[@name='login']//input[@name='pswrd']"));
	       String input4 = "NayabGul";
	       password_.sendKeys(input4);
	       String output4 = password_.getAttribute("value");
	       
	       if (input4.equals(output4)) {
	    	   System.out.print("\nTest Passed");
	       } 
	       else {
    	   System.out.print("\nTest Failed");															
	       }
	       
	       Select cars = new Select(driver.findElement(By.xpath("//select[contains(@id,'multiselect')]")));
	       cars.selectByVisibleText("Hyundai ");
	       
	       Select docs = new Select(driver.findElement(By.xpath("//select[contains(@id,'drop')]")));
	       docs.selectByIndex(3);
	       
	       WebElement textbox = driver.findElement(By.xpath("//input[@type='text' and@name='fname']"));
	       textbox.clear();
	       textbox.sendKeys("Hello World");
	       
	       WebElement button2 = driver.findElement(By.xpath("//button[contains(@id,'but')]"));
	       button2.click();
	       
	       WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
	       submit.click();
	       
	       WebElement loginbutton = driver.findElement(By.xpath("//button[text()='Login']"));
	       loginbutton.click();
	       
	       WebElement register = driver.findElement(By.xpath("//button[text()='Register']"));
	       register.click();
	       
	       WebElement alertClick = driver.findElement(By.xpath("//input[contains(@id,'alert')]"));
	       alertClick.click();
	       
	       String alertText = driver.switchTo().alert().getText();
	       System.out.print("\n" + alertText);
	       driver.switchTo().alert().accept();
	      
	       WebElement popup = driver.findElement(By.linkText("Open a popup window"));
	       popup.click();
	       //error 404

	       //String popupText = driver.switchTo().alert().getText();
	       //System.out.print("\n" + popupText);
	       
	       WebElement female = driver.findElement(By.xpath("//input[@type='radio' and @value='female']"));
	       female.click();
	       
	       WebElement getAlert = driver.findElement(By.xpath("//input[@type='button' and @value='ClickToGetAlert']"));
	       getAlert.click();
	       driver.switchTo().alert().accept();
	       
	       WebElement orange = driver.findElement(By.xpath("//input[@type='checkbox' and @value='orange']"));
	       orange.click();
	       
	       WebElement blue = driver.findElement(By.xpath("//input[@type='checkbox' and @value='blue']"));
	       blue.click();
	       
	       WebElement readtext = driver.findElement(By.xpath("//input[@id='rotb']"));
	       System.out.print("\n" + readtext.getAttribute("value"));
	       
	       WebElement getprompt = driver.findElement(By.xpath("//input[@id='prompt']"));
	       getprompt.click();
	       String promptText = driver.switchTo().alert().getText();
	       driver.switchTo().alert().sendKeys("My name is nayab");
	       System.out.print("\n" + promptText);
	       driver.switchTo().alert().accept();
	       //System.out.print("\n" + promptinput); 
	       //sendkeys not working
	      
	       WebElement getconfirmation = driver.findElement(By.xpath("//input[@id='confirm']"));
	       getconfirmation.click();
	       driver.switchTo().alert().accept();
	       //check xpaths
	       WebElement textbox_1 = driver.findElement(By.xpath("//h2[text()='Locate using class']//parent::div//div//input"));
	       textbox_1.sendKeys("wooohoo!");
	       
	       WebElement textbox_2 = driver.findElement(By.xpath("//h2[text()='element having same class name of above field']//parent::div//div//input"));
	       textbox_2.sendKeys("Howdy?");
	       
	       WebElement radiocar = driver.findElement(By.xpath("//input[@value='Car']"));
	       radiocar.click();
	       
	       WebElement bag = driver.findElement(By.xpath("//input[@value='Bag']"));
	       bag.click();
	       
	       WebElement book = driver.findElement(By.xpath("//input[@value='Book']"));
	       book.click();
	    
	}

}
