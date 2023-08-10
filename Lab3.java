package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   WebDriverManager.chromedriver().setup();
	       ChromeOptions options = new ChromeOptions();
	       ChromeDriver driver = new ChromeDriver(options);
	   
	       String baseurl = "https://omayo.blogspot.in/";
	       driver.get(baseurl);
	       
	       WebElement field_1 = driver.findElement(By.id("ta1"));
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
	       
	       WebElement field_2 =driver.findElement(By.xpath("//div[@id='HTML11']//div[@class='widget-content']//textarea"));
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
	       
	       List<WebElement> List_Head = driver.findElements(By.xpath("//table[@id='table1']//thead//tr//th"));
	       //List<WebElement> ListOfElements_1 = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[1]//td]"))
	       //List<WebElement> ListOfElements_2 = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[2]//td]"));
	       //List<WebElement> ListOfElements_3 = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[3]//td]"));
	       //List<WebElement> ListOfElements_4 = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[4]//td]"));
	       
	       WebElement head;
	       
	       for (int i=0;i<List_Head.size();i++) {
	    	   head= List_Head.get(i);
	    	   System.out.print("\n" + head.getText());
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
	}

}
