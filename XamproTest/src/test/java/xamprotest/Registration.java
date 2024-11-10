package xamprotest;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver-win64 (130)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.xampro.org/");
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/button")).click();
		
		//registration
		driver.findElement(By.xpath("//span[text()='Registration']")).click();
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Adnanjoy");
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("doridrojoy8@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"phoneNumber\"]")).sendKeys("01939427812");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("cse06307482");
		driver.findElement(By.xpath("//input[@id=\"confirmPassword\"]")).sendKeys("cse06307482");
		driver.findElement(By.xpath("//div[@class='account-access-submit-button']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("successMessage")));
		System.out.println("registration successful");
		driver.quit();
	}

}
