package TestNG;

//import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.logging.LogManager;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.api.logs.Logger;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



public class TestNG {

	WebDriver driver;
	ChromeOptions options;
	Actions action;

	
	@Test 
	public void AddCustomer() throws InterruptedException {
		
		
//Setup
		WebDriverManager.chromedriver().setup();
		options = new ChromeOptions();
		driver = new ChromeDriver(options);
		action = new Actions(driver);
		PropertyConfigurator.configure("Log4j.properties");
		
		
		//Open URL
		String baseurl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
		driver.get(baseurl);
		driver.manage().window().maximize();
		//logger.info("Opened URL");
		
		
		
		//Click Manager Login
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[text()='Bank Manager Login']"))));
	//hread.sleep(3000);
	WebElement managerLogin = driver.findElement(By.xpath("//button[text()='Bank Manager Login']"));
	
		action.moveToElement(managerLogin).click();
		
		
		
		Thread.sleep(3000);
		WebElement addCustomer = driver.findElement(By.xpath("//div[@class='center']//button[@class='btn btn-lg tab btn-primary']"));
		action.moveToElement(addCustomer).click();
		
		Thread.sleep(3000);
		WebElement firstName = driver.findElement(By.xpath("//div[@class='form-group']//input[@placeHolder='First Name']"));
		firstName.sendKeys("Nayab");
		
		Thread.sleep(3000);
		WebElement lastName = driver.findElement(By.xpath("//div[@class='form-group']//input[@placeHolder='Last Name']"));
		lastName.sendKeys("Gul");
		
		Thread.sleep(3000);
		WebElement postCode = driver.findElement(By.xpath("//div[@class='form-group']//input[@placeHolder='Post Code']"));
		postCode.sendKeys("54000");
		
		Thread.sleep(3000);
		WebElement addCustomer2 = driver.findElement(By.xpath("//form[@name='myForm']//button"));
		action.moveToElement(addCustomer2).click();
		
		Thread.sleep(3000);
		Alert addCustomerAlert = driver.switchTo().alert();
		addCustomerAlert.accept();
	}
	
	
	@Test 
	public void OpenAccount() {
		
		WebDriverManager.chromedriver().setup();
		new ChromeOptions();
		ChromeDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		
		String baseurl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
		driver.get(baseurl);
		driver.manage().window().maximize();
		
	
		WebElement managerLogin = driver.findElement(By.xpath("//button[@ng-click='manager()']"));
		action.moveToElement(managerLogin).click();
	
		WebElement openAccount = driver.findElement(By.xpath("//div[@class='center']//button[@ng-class='btnClass2']"));
		action.moveToElement(openAccount).click();
		
		Select customerName = new Select(driver.findElement(By.xpath("//select[@name='userSelect']")));
		customerName.selectByValue("2");
		
		Select currency = new Select(driver.findElement(By.xpath("//select[@id='currency']")));
		currency.selectByIndex(0);
		
		WebElement process = driver.findElement(By.xpath("//form[@name='myForm']//button"));
		action.moveToElement(process).click();
		
		Alert openAccountAlert = driver.switchTo().alert();
		openAccountAlert.accept();
	}
	
	@Test
	public void DepositAmount() {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		
		String baseurl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
		driver.get(baseurl);
		driver.manage().window().maximize();
		
	
		WebElement customerLogin = driver.findElement(By.xpath("//button[@ng-click='customer()']"));
		action.moveToElement(customerLogin).click();
		
		Select user = new Select(driver.findElement(By.xpath("//div[@class='form-group']//select")));
		user.selectByIndex(1);
		
		WebElement login = driver.findElement(By.xpath("//form[@name='myForm']//button"));
		action.moveToElement(login).click();
		
		WebElement deposit = driver.findElement(By.xpath("//button[@ng-class='btnClass2']"));
		action.moveToElement(deposit).click();
		
		WebElement depositAmount = driver.findElement(By.xpath("//input[@type='number']"));
		depositAmount.sendKeys("6000");
		
		WebElement deposit2 = driver.findElement(By.xpath("//form[@name='myForm']//button"));
		action.moveToElement(deposit2).click();
	}
	
	@Test
	public void WithdrawAmount() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		
		String baseurl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
		driver.get(baseurl);
		driver.manage().window().maximize();
		
	
		WebElement customerLogin = driver.findElement(By.xpath("//button[@ng-click='customer()']"));
		action.moveToElement(customerLogin).click();
		
		Select user = new Select(driver.findElement(By.xpath("//div[@class='form-group']//select")));
		user.selectByIndex(1);
		
		WebElement login = driver.findElement(By.xpath("//form[@name='myForm']//button"));
		action.moveToElement(login).click();
		
		WebElement withdrawal = driver.findElement(By.xpath("//button[@ng-class='btnClass3']"));
		action.moveToElement(withdrawal).click();
		
		WebElement withdrawAmount = driver.findElement(By.xpath("//input[@type='number']"));
		withdrawAmount.sendKeys("2000");
		
		WebElement withdraw = driver.findElement(By.xpath("//form[@name='myForm']//button"));
		action.moveToElement(withdraw).click();
	}
	
	@Test
	public void GetTransactions() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		
		String baseurl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
		driver.get(baseurl);
		driver.manage().window().maximize();
		
	
		WebElement customerLogin = driver.findElement(By.xpath("//button[@ng-click='customer()']"));
		action.moveToElement(customerLogin).click();
		
		Select user = new Select(driver.findElement(By.xpath("//div[@class='form-group']//select")));
		user.selectByIndex(1);
		
		WebElement login = driver.findElement(By.xpath("//form[@name='myForm']//button"));
		action.moveToElement(login).click();
		
		
		WebElement transactions = driver.findElement(By.xpath("//button[@ng-class='btnClass1']"));
		action.moveToElement(transactions).click();
		
		WebElement startDate = driver.findElement(By.xpath("//div[@class='fixedTopBox']//input[@id='start']"));
		startDate.sendKeys("08/01/2023 00:00:000 AM");
		
		WebElement endDate = driver.findElement(By.xpath("//div[@class='fixedTopBox']//input[@id='end']"));
		endDate.sendKeys("08/16/2023 09:00:000 AM");
	
	}
		
		
		
		

		
		//WebElement Customers = driver.findElement(By.xpath("//div[@class='center']//button[@ng-class='btnClass3']"));
		
		
	

}
