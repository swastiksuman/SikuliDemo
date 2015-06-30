package SikuliTest.SikuliTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
public class AppTest{
	
	WebDriver driver;
	
	@Test
	public void sikuliCheck() throws FindFailed{
		
		driver = new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		
		Screen screen = new Screen();
		
		Pattern loginLink = new Pattern("V:/MyWorkspace/SikuliTest/src/test/java/imageObjects/Login.PNG");
		Pattern userEdit = new Pattern("V:/MyWorkspace/SikuliTest/src/test/java/imageObjects/Username.PNG");
		Pattern passEdit = new Pattern("V:/MyWorkspace/SikuliTest/src/test/java/imageObjects/Username.PNG");
		
		screen.wait(loginLink, 30);
		screen.click(loginLink);
		screen.type(userEdit, "swastiksuman@gmail.com");
		screen.type(passEdit, "somepass");
		
	}
	
}