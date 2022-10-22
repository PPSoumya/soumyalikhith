package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//getTExt
		//WebElement ele = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
		//System.out.println(ele.getText());
		//getSize
		WebElement ele=driver.findElement(By.cssSelector("input[id='email']"));
		Dimension d=ele.getSize();
		int h=d.getHeight();
		int w=d.getWidth();
		System.out.println(h + "  "+w);
		
		//getlocation
		Point p=ele.getLocation();
		int x=p.getX();
		int y=p.getY();
		System.out.println(x+ " " +y);
		

	}

}
