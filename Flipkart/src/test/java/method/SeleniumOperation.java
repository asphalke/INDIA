package method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOperation
{
	public static WebDriver driver=null;
	
	public static void browserLaunch(Object[] inputParameters)
	{
		String browserName=(String) inputParameters[0];
		String exe=(String) inputParameters[1];
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", exe);
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		/*else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", exe);
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		}*/
	}	
	
	public static void openApplication(Object[]inputParameters)
	{
		String url=(String)inputParameters[0];
		driver.get(url);
	}
	
	public static void cancelWindow(Object[] inputParameters)
	{
		String xpath=(String) inputParameters[0];
		driver.findElement(By.xpath(xpath)).click();
	}
		public static void main(String[] args)
		{
			//Launch Browser
			Object [] input=new Object[2];
			input[0]="Chrome";
			input[1]="D:\\MAVEN\\FLIPKART\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe";
			SeleniumOperation.browserLaunch(input);
			
			//Open URL
			Object [] input1=new Object[1];
			input1[0]="https://www.flipkart.com/";
			SeleniumOperation.openApplication(input1);
			
			//Cancel window
			Object [] input2=new Object[1];
			input2[0]="//*[@class='_2KpZ6l _2doB4z']";
			SeleniumOperation.cancelWindow(input2);
		}
		
	}

