import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestcases {
	
	WebDriver driver = new ChromeDriver();

@BeforeTest

public void mySetup() throws InterruptedException {
	String myURl = "https://www.saucedemo.com/v1/";

	driver.get(myURl);
	
	
	
}

@Test
public void Login() throws InterruptedException {
	 WebElement UserName=  driver.findElement(By.id("user-name"));
	 WebElement Passward= driver.findElement(By.id("password"));
	 WebElement Login=driver.findElement(By.id("login-button"));

	 UserName.sendKeys("standard_user");
	 Passward.sendKeys("secret_sauce");
	Login.click();
	 WebElement FirstItemButton =driver.findElement(By.cssSelector("#inventory_container > div > div:nth-child(1) > div.pricebar > button"));
	 FirstItemButton.click();
	 
	 
}
@AfterTest

public void AfterTesting() {
	
	
	
	
}
}
