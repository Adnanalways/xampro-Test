package xamprotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\chromedriver-win64 (130)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.xampro.org/");
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/button")).click();
		//login
		
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("doridrojoy8@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("cse06307482");
		driver.findElement(By.xpath("//div[@class=\"account-access-submit-button\"]")).click();
		
		System.out.println("sucessfully login");
	}

}
