package HtmlUnitDriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Facebook_Hompage_Load_Testing {
	
	WebDriver driver;
	
	@Test
	public void setup() {
		driver =new HtmlUnitDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	
	}

}
