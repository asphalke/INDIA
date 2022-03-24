package PlainTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UnitTestCase 
{

	public static void main (String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\TESTING\\chromedriver.exe");
		
          ChromeDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://www.flipkart.com");
          driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
          
         Actions act=new Actions(driver);
         WebElement abc=driver.findElement(By.xpath("//*[@class='_1_3w1N']"));
         act.moveToElement(abc).build().perform();
	}
	
	
}
