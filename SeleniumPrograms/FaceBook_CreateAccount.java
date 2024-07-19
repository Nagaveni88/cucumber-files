package SeleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook_CreateAccount {
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FaceBook_CreateAccount fb1=new FaceBook_CreateAccount();
		fb1.setup();
		fb1.CreateAccount();

	}
	private void CreateAccount() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Create new account")).click();
	    driver.findElement(By.name("firstname")).sendKeys("sri");
	    driver.findElement(By.name("lastname")).sendKeys("cute");
	    driver.findElement(By.name("reg_email__")).sendKeys("sri@gmail.com");
	    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sri@gmail.com");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("sricute@2233");
	    new Select(driver.findElement(By.id("day"))).selectByIndex(19);
	   new Select(driver.findElement(By.id("month"))).selectByValue("3");
	   new Select(driver.findElement(By.id("year"))).selectByVisibleText("2000");
	   
		
	}
	private void setup() {
		
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

}
