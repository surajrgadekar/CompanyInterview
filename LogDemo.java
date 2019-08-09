package Log4j;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogDemo {
	static Logger log;
	static WebDriver driver;

	public static void main(String[] args) {
		//log=Logger.getLogger("C:\\Mamta\\programs\\TestNG\\src\\Log4j\\log4j.properties");
	
		driver = new FirefoxDriver();
		driver.get("file:///E:/Selenium%20Software/Offline%20Website/index.html");
		log=Logger.getLogger("C:\\Mamta\\programs\\TestNG\\src\\Log4j\\log4j.properties");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
