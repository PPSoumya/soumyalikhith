package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification {

	public static void main(String[] args) 
	{

		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://demo.actitime.com/login.do");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//WebElement button = driver.findElement(By.xpath("//div[text()='Login ']"));

//if(button.isEnabled()) {
//System.out.println("Pass:button is enabled");
//button.click();
		//isSelected
		
	//	WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://demo.actitime.com/login.do");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		//checkbox.click();
	//if(checkbox.isSelected()) {
		//System.out.println("Pass:element is selected");
		
	//}
	//else
	//{
	//}
	
	//}

		//isSelected
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click(); 	
        WebElement radiobtn = driver.findElement(By.name("sex"));
	    radiobtn.click();
        if(radiobtn.isSelected()) {
	    System.out.println("pass:elemnt i selected");
        }
        else
        {
	      System.out.println("fail:element is not selected");
        }

       
	    }
	


}
