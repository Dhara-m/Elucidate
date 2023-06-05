package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchPositive {

	public static void main(String[] args) {
		
		// initiate the chrome browser
				WebDriverManager. chromedriver(). setup();
				WebDriver driver = new ChromeDriver();
				
				//call Elucidate browser browser
				driver.get("https://monitor.elucidate.co/");
				System.out.println(driver.getTitle());
				
				driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
				
				
				//Finding the search button and typing Bank -positive test
				driver.findElement(By.id("search")).sendKeys("Bank");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				
				// click on search button
				driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
				
				// 
				
			      }

	}


