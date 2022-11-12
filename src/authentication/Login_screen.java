package authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_screen {

	public static void main(String[] args) throws InterruptedException {
		
		 String test_email="rneem.shammout@hotmail.com";
		 String test_password= "12345663";
		 String testpassword2= "423232";
		
		System.setProperty("webdriver.chrome.driver", "G:\\my new driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https:\\www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys(test_email);
		
		driver.findElement(By.id("pass")).sendKeys(test_password);
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Forgot Password?']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		
		String thesentcode="0000";
		
		

	}

}
