package Chapter1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggession {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("seleni");
		
		//ele.sendKeys("seleni");
		Thread.sleep(3000);
		List<WebElement>x= driver.findElements(By.xpath("//li[@class='sbct']"));
		System.out.println(x.size());
		for(WebElement a: x)
		{
			System.out.println(a.getText());
		}
		
		
		
	}

}
