package practice;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project1Amazon 
{
	static WebDriver driver;
	public static void screenshotmeth() throws IOException
	
	{
		Date d = new Date();


		
		DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
	    String date = d1.format(d) ;
	    
	    TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("D:\\ScreenShot\\soucedemopp"+date+".jpg");
					
		FileHandler.copy(source, destination);	
		
	}
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		System.setProperty("webdriver.chrome.driver",
		         "D:\\sele1\\chromedriver.exe");

				 driver =  new ChromeDriver();
               driver.manage().window().maximize();
				driver.get("https://www.amazon.in/");
				
				String ExpectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
				String ExTitle = "Amazon Sign In";
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				screenshotmeth();
//				
//				WebElement search = driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit-button')]"));
//				search.click();
				
				WebElement sign = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
				sign.click();
				WebElement login = driver.findElement(By.xpath("//input[@id='ap_email']"));
				login.sendKeys("8308830074");
				WebElement start = driver.findElement(By.xpath("//input[@id='continue']"));
				start.click();
				
				WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
				password.sendKeys("sonali16");
				WebElement signin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
				signin.click();
				
			Thread.sleep(3000);
			screenshotmeth();
		String title = driver.getTitle();
		System.out.println(title);
		
		if(ExpectedTitle.equals(title))
		{
			System.out.println("Test case is pass");
		
		}
		else
		{
			System.out.println("Test case is fail");
		}
				
		WebElement signout = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));	
				
		WebElement signout1 = driver.findElement(By.xpath("//span[text()='Sign Out']"));
		signout1.click();
		screenshotmeth();
		
		Thread.sleep(3000);
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		if(ExTitle.equals(title1))
		{
			System.out.println("Test case is pass");
		
		}
		else
		{
			System.out.println("Test case is fail");
		}
		
		
	}


}
