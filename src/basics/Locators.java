package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.id("email")).sendKeys("soumya");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("soumya");
		driver.findElement(By.name("pass")).sendKeys("password");
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		
	}

}
