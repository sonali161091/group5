package practice;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeofElement {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
		         "D:\\sele1\\chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
               driver.manage().window().maximize();
				driver.get("https://vctcpune.com/selenium/practice.html#serviceid");
				
				WebElement textbox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
				Point p = textbox.getLocation();
				System.out.println(p);
				
			int x =	textbox.getLocation().getX();
			System.out.println("x co-ordinate = "+x);
			
			int y =	textbox.getLocation().getY();
			System.out.println("y co-ordinate = "+y);
			
			
			
			
				
	

}
}