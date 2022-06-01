package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionAll 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
		         "D:\\sele1\\chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
               driver.manage().window().maximize();
				driver.get("https://demoqa.com/buttons");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				Actions act =new Actions(driver);
				
				//double Click
				WebElement dubleclick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
				act.doubleClick(dubleclick).perform();
				String data1 =  dubleclick.getText();
				System.out.println(data1);
				
				//Right Click
				WebElement rightclick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
				act.contextClick(rightclick).perform();
				String data2 =  rightclick.getText();
				System.out.println(data2);
				
				//left Click
				WebElement leftclick = driver.findElement(By.xpath("//button[text()='Click Me']"));
				act.click(leftclick).perform();
				String data3 =  leftclick.getText();
				System.out.println(data3);
				
				

}
}