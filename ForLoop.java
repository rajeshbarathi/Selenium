package trial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForLoop {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div/button[@type='button']")).click();
		Thread.sleep(1500);
		List<WebElement> courses = driver.findElements(By.xpath("//span/ul/li")); // "" //li[@role='option']
		
		for (int i = 0; i < courses.size(); i++) {
			
			String course = courses.get(i).getText();

			if(course.equalsIgnoreCase("jmeter")) {
				courses.get(i).click();
			}
		}
	}
	
	
}
