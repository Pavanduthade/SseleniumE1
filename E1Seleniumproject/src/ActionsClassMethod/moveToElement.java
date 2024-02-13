package ActionsClassMethod;

import java.time.Duration;

//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		
		Actions act=new Actions(driver);
		
		WebElement button = driver.findElement(By.id("btn30"));
		act.contextClick(button).perform();
		WebElement rightClick = driver.findElement(By.xpath("//div[text()='Yes']"));
		

	}

}
