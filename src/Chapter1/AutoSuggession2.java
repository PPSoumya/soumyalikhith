package Chapter1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggession2 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("seleni");
		
		//ele.sendKeys("seleni");
		List<WebElement>li=driver.findElements(By.xpath("//li[@class='sbct']"));
		
		for(WebElement e : li)
			
		{
			System.out.println(e.getText());
		}
		
	}

}
