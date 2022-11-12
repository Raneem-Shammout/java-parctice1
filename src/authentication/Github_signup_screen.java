package authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github_signup_screen {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "G:\\my new driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		
		String myname= "raneem" ;
		Integer myage= 23 ;
		Double hieght= 158.1 ;
		Boolean iloveyou=true;
		
		System.out.println(myname+"  "+myage+"  "+hieght+"  "+iloveyou);
		
		driver.manage().window().maximize();  
		
		driver.get("https:\\www.booking.com");
		
		driver.manage().window().minimize();
		
		driver.manage().window().fullscreen();
		
		driver.findElement(By.className("js-header-login-link")).click();
	}

}
