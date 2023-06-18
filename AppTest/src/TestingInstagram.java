import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingInstagram  {
	
	@Test
	public static void InstagramApp() throws IOException {
		// launch_Browser
		WebDriver driver=new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		
		// navigate to instagram page
		driver.get("https://www.instagram.com");
		
		// title of instagram page
	    String actual_title=driver.getTitle();
		String expected_title="Instagram";
		Assert.assertEquals(expected_title, actual_title);
		
		
		// imlicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//locate and sendkeys
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Kitty");
		
		//locate and sendKeys in pwd field
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("lokal");
		
		// locate and click on login field
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
		
		// take screen shot
		//File click=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(click,new File("./instagram.png"));
		
		// locate and click link using linkText
		driver.findElement(By.partialLinkText("Forgot password?")).click();
		
		// locate and sendkeys reset pwd section
		driver.findElement(By.name("cppEmailOrUsername")).sendKeys("125op");
		
		// back to page
		driver.navigate().back();
		
		// locate and click sign up 
		driver.findElement(By.linkText("Sign up")).click();
		
		// imlicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		
		// locate and sendkeys Mobile Number or Email
		driver.findElement(By.xpath("//input[@aria-label=\"Mobile Number or Email\"]")).sendKeys("7846781297");

		// locate and sendkeys Full Name
		driver.findElement(By.name("fullName")).sendKeys("BOB");

		// locate and sendkeys username
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("love_bob");

		// locate and click password
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("123BOB");
		
		// locate and click on sign up
		driver.findElement(By.cssSelector("button._acan[type=\"submit\"]")).click();
		
		// refresh of page
		driver.navigate().refresh();
		
		// back to a page
		driver.navigate().back();
		
	}

}

