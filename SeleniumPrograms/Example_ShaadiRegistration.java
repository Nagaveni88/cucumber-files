package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_ShaadiRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.shaadi.com");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[text()='Login']")).click();
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nv12345@gmail.com");
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8340017477");
		//driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		//driver.findElement(By.xpath("//a[text()='Sign Up Free ']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='Myself']")).click();
		//driver.findElement(By.xpath("//span[text()='Female']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='I'm looking for a']/following-sibling::div//div[contains(@class,'is-selected')]")).click();
		driver.findElement(By.xpath("//div[text()='Woman'and @role='option']")).click();

	}

}
