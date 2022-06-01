package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
		         "D:\\sele1\\chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
               driver.manage().window().maximize();
				driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				Actions act =new Actions(driver);
				
				
			WebElement oslo = driver.findElement(By.xpath("//div[@id='box1']"));
			WebElement stockhome = driver.findElement(By.xpath("//div[@id='box2']"));
			WebElement washingtone = driver.findElement(By.xpath("//div[@id='box3']"));
			WebElement copenhagen = driver.findElement(By.xpath("//div[@id='box4']"));
			
			WebElement norway = driver.findElement(By.xpath("//div[@id='box101']"));
			WebElement sweden = driver.findElement(By.xpath("//div[@id='box102']"));
			WebElement us = driver.findElement(By.xpath("//div[@id='box103']"));
			WebElement Denmark = driver.findElement(By.xpath("//div[@id='box104']"));
			
			act.dragAndDrop(oslo, norway).perform();
			act.dragAndDrop(stockhome, sweden).perform();
			act.dragAndDrop(washingtone, us).perform();
			act.dragAndDrop(copenhagen, Denmark).perform();
	
			
}
}
