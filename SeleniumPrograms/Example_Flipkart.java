package SeleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span['text()=Login']")).click();
		driver.findElement(By.xpath("//div[3]//input[@type='text']")).sendKeys("7815852818");
		//Thread.sleep(20);
		driver.findElement(By.xpath("//div[3]//button[text()='Request OTP']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button/span[text()='CONTINUE']")).click();
		driver.findElement(By.xpath("//form//div[3]//input[@type='text']")).sendKeys("");
		driver.findElement(By.xpath("//button//span[text()='Signup']")).click();
		driver.findElement(By.xpath("//div[2]//input[@type='text']")).sendKeys("chairs");
		
		
	}

}

