package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_MicrosoftEdge {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//Thread.sleep(2000);
		driver.get("https://account.microsoft.com/account/Account");
		driver .manage().window().maximize();
		driver.findElement(By.xpath("//button//span[text()='Sign in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Create one!']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='usernameInput']")).sendKeys("dadda5588@gmail.com");
		driver.findElement(By.xpath("//button[@id='nextButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("daddda58");
		driver.findElement(By.xpath("//input[@name='ShowHidePasswordCheckbox']")).click();
		driver.findElement(By.xpath("//button[@id='nextButton']")).click();
		Thread.sleep(2000);
		new Select(driver.findElement(By.xpath("//select[@id='countryRegionDropdown']"))).selectByVisibleText("India");
		new Select(driver.findElement(By.xpath("//select[@name='BirthMonth']"))).selectByVisibleText("April");
		new Select(driver.findElement(By.xpath("//select[@name='BirthDay']"))).selectByValue("4");
		driver.findElement(By.xpath("//input[@name='BirthYear']")).sendKeys("2000");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		driver.findElement(By.xpath("//input[@id='VerificationCode']")).click();
		driver.findElement(By.xpath("//button[text()='Next']")).click();

	}

}
