package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_Selenium {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("srillu@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("srilu@123");
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("srillu@gmail.com");
		driver.findElement(By.name("lastname")).sendKeys("potti");
		driver.findElement(By.name("reg_email__")).sendKeys("potti222@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("potti222@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("potti2232");
		new Select(driver.findElement(By.id("day"))).selectByIndex(19);
		new Select(driver.findElement(By.id("month"))).selectByValue("4");
    	new Select(driver.findElement(By.id("year"))).selectByValue("2000");
	    driver.findElement(By.xpath("//label[text()='Female']")).click();
	    driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		
		
		
		

	}

}
