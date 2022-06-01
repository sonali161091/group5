package practice;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		         "D:\\sele1\\chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
                driver.manage().window().maximize();
				driver.get("https://www.facebook.com");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
				userName.sendKeys("sonaliskothule@gmail.com");
	
				
				WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
				password.sendKeys("sonali161091");
				
				
				
			WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
				login.click();
				
				WebElement logout = driver.findElement(By.xpath("//*[@id=\"mount_0_0_2m\"]/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]"));
				logout.click();
				
				WebElement logout1 = driver.findElement(By.xpath("//*[@id=\"mount_0_0_2m\"]/div/div[1]/div/div[2]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[3]/div/div[4]/div/div[1]/div[2]/div/div/div/div/span"));
				logout1.click();
				
}
	

}
