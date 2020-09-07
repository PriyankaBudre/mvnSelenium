package DemoGI.DemoAI;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
import org.testng.annotations.*;

//import com.beust.jcommander.Parameters;

/**
 * Hello world!
 *
 */
public class App 
{

	//@Parameters({"Port"})
	@Test
	public void initiateDriver() throws MalformedURLException, InterruptedException  {
		System.out.println("testNG");
		//WebDriver driver = null;
		//if(Port.equalsIgnoreCase("9001")) {
		
/*
			WebDriver driver = new RemoteWebDriver(new URL("http:localhost:4444/wd/hub"), DesiredCapabilities.chrome());
		//WebDriver driver = new  RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities);
			
	        driver.manage().window().maximize();
	        driver.get("https://medium.com/");
	        Reporter.log("URL is opened");
	        Thread.sleep(1000);
	        driver.close();
	        driver.quit();
			
		//} */
		

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/pbudre/eclipse-workspace/chromedriver_win32/chromedriver.exe");	

		driver.get("https://medium.com/");
		Reporter.log("URL is opened");
		Thread.sleep(10000); 
		//driver.close(); 
		
	}
    /*public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }*/
}
