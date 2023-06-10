package harishacademygroup.Cucumberproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	WebDriver driver;
	protected Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\Confi\\data.properties");
		prop=new Properties();
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		System.out.print("Browser Name: "+browsername);
		if(browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
				
		return driver;
		
	}

}
