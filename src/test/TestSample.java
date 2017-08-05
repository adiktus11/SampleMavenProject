package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSample {
	
	@Test
	public void TestOne() {
		System.out.println("This is a sample test.");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		
		Assert.assertEquals(driver.getTitle(), "Google");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}
	
}
