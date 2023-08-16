package TestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_ {

	WebDriver driver;
	ChromeOptions options;
	// Logger Logger;

	@Test(priority = 1)
	public void AddCustomer() throws InterruptedException, IOException {

		// Setup
		WebDriverManager.chromedriver().setup();
		options = new ChromeOptions();
		driver = new ChromeDriver(options);
		Actions action = new Actions(driver);
		PropertyConfigurator.configure("Log4j.properties");

		// Open URL
		String baseurl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
		driver.get(baseurl);
		driver.manage().window().maximize();
		// logger.info("Opened URL");

		// Click Manager Login
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("//button[text()='Bank
		// Manager Login']"))));
		Thread.sleep(2000);
		WebElement managerLogin = driver.findElement(By.xpath("//button[text()='Bank Manager Login']"));
		action.moveToElement(managerLogin).click().perform();
		// logger.info("Manager logged in");

		// Add Customer
		// WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait1.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("//button[@ng-class='btnClass1']"))));
		Thread.sleep(2000);
		WebElement addCustomer = driver.findElement(By.xpath("//button[@ng-class='btnClass1']"));
		action.moveToElement(addCustomer).click().perform();
		// logger.info("Manager wants to add customer");

		// WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement firstName = driver
				.findElement(By.xpath("//div[@class='form-group']//input[@placeHolder='First Name']"));
		// wait2.until(ExpectedConditions.visibilityOf(firstName))));
		firstName.sendKeys("Nayab");

		// WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement lastName = driver
				.findElement(By.xpath("//div[@class='form-group']//input[@placeHolder='Last Name']"));
		// wait3.until(ExpectedConditions.visibilityOf(lastName))));
		lastName.sendKeys("Gul");

		// WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement postCode = driver
				.findElement(By.xpath("//div[@class='form-group']//input[@placeHolder='Post Code']"));
		postCode.sendKeys("54000");
		// logger.info("Manager has added details of customer");

		// WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement addCustomer2 = driver.findElement(By.xpath("//form[@name='myForm']//button"));
		// wait3.until(ExpectedConditions.visibilityOf(lastName))));
		action.moveToElement(addCustomer2).click().perform();
		// logger.info("Manager has added the customer");

		// WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		Alert addCustomerAlert = driver.switchTo().alert();
		// wait3.until(ExpectedConditions.visibilityOf(addCustomerAlert))));
		addCustomerAlert.accept();
		// logger.info("Customer has been successfully added");

		// WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement homeButton = driver.findElement(By.xpath("//button[@class='btn home']"));
		// wait7.until(ExpectedConditions.visibilityOf(homeButton))));
		action.moveToElement(homeButton).click().perform();
		// logger.info("Manager has added the customer");
	}

	@Test(priority = 2)
	public void OpenAccount() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		new ChromeOptions();
		ChromeDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);

		String baseurl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
		driver.get(baseurl);
		driver.manage().window().maximize();
		//logger.info("Opened URL");

		//WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement managerLogin = driver.findElement(By.xpath("//button[@ng-click='manager()']"));
		//wait8.until(ExpectedConditions.visibilityOf(managerLogin))));
		action.moveToElement(managerLogin).click().perform();
		//logger.info("Manager logged in");
		
		//WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement openAccount = driver.findElement(By.xpath("//div[@class='center']//button[@ng-class='btnClass2']"));
		//wait9.until(ExpectedConditions.visibilityOf(openAccount))));
		action.moveToElement(openAccount).click().perform();
		//logger.info("Manager wants to open account");

		//WebDriverWait wait10 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		Select customerName = new Select(driver.findElement(By.xpath("//select[@name='userSelect']")));
		//wait10.until(ExpectedConditions.visibilityOf(customerName))));
		customerName.selectByValue("2");

		//WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		Select currency = new Select(driver.findElement(By.xpath("//select[@id='currency']")));
		//wait11.until(ExpectedConditions.visibilityOf(currency))));
		currency.selectByIndex(2);
		//logger.info("Account details have been added");

		//WebDriverWait wait12 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement process = driver.findElement(By.xpath("//form[@name='myForm']//button"));
		//wait12.until(ExpectedConditions.visibilityOf(process))));
		action.moveToElement(process).click().perform();
		//logger.info("Account is processing");

		//WebDriverWait wait13 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		Alert openAccountAlert = driver.switchTo().alert();
		//wait13.until(ExpectedConditions.visibilityOf(openAccountAlert))));
		openAccountAlert.accept();
		//logger.info("Account has successfully opened");

		//WebDriverWait wait14 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement homeButton = driver.findElement(By.xpath("//button[@class='btn home']"));
		//wait14.until(ExpectedConditions.visibilityOf(homeButton))));
		action.moveToElement(homeButton).click().perform();
		
	}

	@Test(priority = 3)
	public void DepositAmount() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);

		String baseurl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
		driver.get(baseurl);
		driver.manage().window().maximize();
		//logger.info("Opened URL");

		//WebDriverWait wait15 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement customerLogin = driver.findElement(By.xpath("//button[@ng-click='customer()']"));
		//wait15.until(ExpectedConditions.visibilityOf(customerLogin))));
		action.moveToElement(customerLogin).click().perform();
		//logger.info("Customer wants to login");
		
		//WebDriverWait wait16 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		Select user = new Select(driver.findElement(By.xpath("//div[@class='form-group']//select")));
		//wait16.until(ExpectedConditions.visibilityOf(user))));
		user.selectByIndex(1);

		//WebDriverWait wait17 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//form[@name='myForm']//button"));
		//wait17.until(ExpectedConditions.visibilityOf(login))));
		action.moveToElement(login).click().perform();
		//logger.info("Customer logs in");

		//WebDriverWait wait18 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement deposit = driver.findElement(By.xpath("//button[@ng-class='btnClass2']"));
		//wait18.until(ExpectedConditions.visibilityOf(deposit))));
		action.moveToElement(deposit).click().perform();
		//logger.info("Customer wants to make a deposit");

		//WebDriverWait wait19 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement depositAmount = driver.findElement(By.xpath("//input[@type='number']"));
		//wait19.until(ExpectedConditions.visibilityOf(depositAmount))));
		depositAmount.sendKeys("6000");
		//logger.info("Customer selects amount to be deposited");

		//WebDriverWait wait20 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement deposit2 = driver.findElement(By.xpath("//form[@name='myForm']//button"));
		//wait20.until(ExpectedConditions.visibilityOf(deposit2))));
		action.moveToElement(deposit2).click().perform();
		//logger.info("Customer deposits amount successfully");
		

		//WebDriverWait wait21 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement homeButton = driver.findElement(By.xpath("//button[@class='btn home']"));
		//wait21.until(ExpectedConditions.visibilityOf(homeButton))));
		action.moveToElement(homeButton).click().perform();
		
	}
	
	@Test (priority = 4)
	public void WithdrawAmount() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);

		String baseurl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
		driver.get(baseurl);
		driver.manage().window().maximize();
		//logger.info("Opened URL");

		//WebDriverWait wait22 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement customerLogin = driver.findElement(By.xpath("//button[@ng-click='customer()']"));
		//wait22.until(ExpectedConditions.visibilityOf(customerLogin))));
		action.moveToElement(customerLogin).click().perform();
		//logger.info("Customer wants to login");
		
		//WebDriverWait wait23 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		Select user = new Select(driver.findElement(By.xpath("//div[@class='form-group']//select")));
		//wait23.until(ExpectedConditions.visibilityOf(user))));
		user.selectByIndex(1);

		//WebDriverWait wait24 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//form[@name='myForm']//button"));
		//wait24.until(ExpectedConditions.visibilityOf(login))));
		action.moveToElement(login).click().perform();
		//logger.info("Customer logs in");
		
		//WebDriverWait wait25 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(000);
		WebElement withdrawal = driver.findElement(By.xpath("//button[@ng-class='btnClass3']"));
		//wait25.until(ExpectedConditions.visibilityOf(withdrawal))));
		action.moveToElement(withdrawal).click().perform();
		//logger.info("Customer wants to withdraw amount");
		
		//WebDriverWait wait26 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement withdrawAmount = driver.findElement(By.xpath("//input[@type='number']"));
		//wait26.until(ExpectedConditions.visibilityOf(withdrawAmount))));
		withdrawAmount.sendKeys("2000");
		//logger.info("Customer enters amount to be withdrawn");
		
		//WebDriverWait wait27 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement withdraw = driver.findElement(By.xpath("//form[@name='myForm']//button"));
		//wait27.until(ExpectedConditions.visibilityOf(withdraw))));
		action.moveToElement(withdraw).click().perform();
		//logger.info("Customer withdraws amount successfully");
		
		//WebDriverWait wait28 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement homeButton = driver.findElement(By.xpath("//button[@class='btn home']"));
		//wait28.until(ExpectedConditions.visibilityOf(homeButton))));
		action.moveToElement(homeButton).click().perform();
	}
	
	
	@Test (priority = 5)
	public void GetTransactions() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);

		String baseurl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
		driver.get(baseurl);
		driver.manage().window().maximize();
		//logger.info("Opened URL");

		//WebDriverWait wait29 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement customerLogin = driver.findElement(By.xpath("//button[@ng-click='customer()']"));
		//wait29.until(ExpectedConditions.visibilityOf(customerLogin))));
		action.moveToElement(customerLogin).click().perform();
		//logger.info("Customer wants to login");
		
		//WebDriverWait wait30 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		Select user = new Select(driver.findElement(By.xpath("//div[@class='form-group']//select")));
		//wait30.until(ExpectedConditions.visibilityOf(user))));
		user.selectByIndex(1);

		//WebDriverWait wait31 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//form[@name='myForm']//button"));
		//wait31.until(ExpectedConditions.visibilityOf(login))));
		action.moveToElement(login).click().perform();
		//logger.info("Customer logs in");
		
		//WebDriverWait wait33 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement transactions = driver.findElement(By.xpath("//button[@ng-class='btnClass1']"));
		//wait33.until(ExpectedConditions.visibilityOf(transactions))));
		action.moveToElement(transactions).click();
		
		//WebDriverWait wait34 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement startDate = driver.findElement(By.xpath("//div[@class='fixedTopBox']//input[@id='start']"));
		//wait34.until(ExpectedConditions.visibilityOf(startDate))));
		startDate.sendKeys("08/01/2023 00:00:000 AM");
		
		//WebDriverWait wait35 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement endDate = driver.findElement(By.xpath("//div[@class='fixedTopBox']//input[@id='end']"));
		//wait35.until(ExpectedConditions.visibilityOf(endDate))));
		endDate.sendKeys("08/16/2023 09:00:000 AM");
	
		//WebDriverWait wait36 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement homeButton = driver.findElement(By.xpath("//button[@class='btn home']"));
		//wait36.until(ExpectedConditions.visibilityOf(homeButton))));
		action.moveToElement(homeButton).click().perform();
		
		
		//WebDriverWait wait36 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement logout = driver.findElement(By.xpath("//button[@class='btn logout']"));
		//wait36.until(ExpectedConditions.visibilityOf(logout))));
		action.moveToElement(logout).click().perform();
		
		//WebElement Customers = driver.findElement(By.xpath("//div[@class='center']//button[@ng-class='btnClass3']"));
		
	}

}
