package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
    driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&ifkv=AdF4I74s13L-cSOUPJSFh-TTB4Du5nppfw8a0QrVyOCg5BQVIkyQR19MEaPUjoey2Ui1XwwzHlV8ag&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1794722297%3A1720690838899658&ddm=0");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("n@gmail.com");
    driver.findElement(By.xpath("//span[text()='Create account']")).click();
    driver.findElement(By.xpath("//span[text()='For my personal use']")).click();
    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Nagaveni");
    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Yadavalli");
    driver.findElement(By.xpath("//span[text()='Next']")).click();
    Thread.sleep(4000);
    new Select(driver.findElement(By.xpath("//select[@id='month']"))).selectByVisibleText("April");
    driver.findElement(By.xpath("//input[@name='day']")).sendKeys("19");
    driver.findElement(By.xpath("//input[@name='year']")).sendKeys("2000");
    new Select(driver.findElement(By.xpath("//select[@id='gender']"))).selectByVisibleText("Female");
    driver.findElement(By.xpath("//span[text()='Next']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[text()='Create your own Gmail address']")).click();
    driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("Naniyadavalli12345");
    driver.findElement(By.xpath("//span[text()='Next']")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Nani@5588");
    driver.findElement(By.xpath("//input[@name='PasswdAgain']")).sendKeys("Nani@5588");
    driver.findElement(By.xpath("//span[text()='Next']")).click();
    Thread.sleep(3000);
  //  driver.findElement(By.xpath("//input[@id='phoneNumberId']")).sendKeys("7815852818");
    driver.findElement(By.xpath("//span[text()='Next']")).click();
    driver.findElement(By.xpath("//span[text()='Skip']")).click();
    // driver.findElement(By.xpath("//span[text()='Next']")).click();
    
    
	
	}}
