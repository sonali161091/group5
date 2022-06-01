package project;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByProduct 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver",
		         "D:\\sele1\\chromedriver.exe");
		
		

			WebDriver driver =  new ChromeDriver();
               driver.manage().window().maximize();
				driver.get("https://www.saucedemo.com");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				WebElement userName = driver.findElement(By.xpath("//input[@class='input_error form_input'][1]"));
				userName.sendKeys("standard_user") ;
				WebElement password = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
				password.sendKeys("secret_sauce");
				WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
				login.click();
				
				List<WebElement> product =driver.findElements(By.xpath("//button[text()='Add to cart']"));
	            
				for(int i=0;i<product.size();i++)
				{
					product.get(i).click();
				}
				
				WebElement cart = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
				cart.click();
				WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
				checkout.click();
				
				WebElement FName = driver.findElement(By.xpath("//input[@id='first-name']"));
				FName.sendKeys("Sonali") ;
				
				WebElement LName = driver.findElement(By.xpath("//input[@id='last-name']"));
				LName.sendKeys("Waykar");
				
				WebElement pin = driver.findElement(By.xpath("//input[@id='postal-code']"));
				pin.sendKeys("422009");
				

				WebElement countinue = driver.findElement(By.xpath("//input[@id='continue']"));
				countinue.click();
				
				WebElement finish = driver.findElement(By.xpath("//input[@id='finish']"));
				finish.click();
				
				
				

}
}