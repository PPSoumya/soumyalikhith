package Chapter1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("search-alias=arts-crafts-intl-ship");
		s.selectByVisibleText("Automotive");
		
		

	}

}
