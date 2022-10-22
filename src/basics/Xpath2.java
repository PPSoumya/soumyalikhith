package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {

	public static void main(String[] args)
	{
		//6 type
		//1.xpath
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("soumya");
		driver.findElement(By.xpath("//input[contains(@id,r'twotabsearchtextbox')]")).sendKeys("soumya");
		WebElement ele=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		ele.submit();
		
		
	}
	
	

}
