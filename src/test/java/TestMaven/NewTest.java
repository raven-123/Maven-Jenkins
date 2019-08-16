package TestMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class NewTest {
	static
	{
		 System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Ravi\\eclipse-workspace\\selenium\\softwares\\chromedriver.exe");
	}
	
	@Test
  public  void testDemoOne() {
	

	 
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://maven.apache.org/download.cgi");
	 System.out.println(driver.getTitle());
  }
}
