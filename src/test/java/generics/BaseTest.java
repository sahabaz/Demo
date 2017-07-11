package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

abstract class BaseTest implements AutoConst
{
	public static WebDriver driver;
	
	@BeforeMethod
	void precondition()
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver = new ChromeDriver();
	}
	
	@AfterMethod
	void postcondition()
	{
		driver.close();
	}
}
