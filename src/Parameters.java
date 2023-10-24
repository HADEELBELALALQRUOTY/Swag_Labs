
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Parameters {
	
	static String Url = "https://www.saucedemo.com/";
	static String StandardUserName = "standard_user";
	static String ProblemUserName = "problem_user";

	static String PerformanceUserName = "performance_glitch_user";

	static String passWord = "secret_sauce";
	
	
	static WebDriver driver = new EdgeDriver();
	static void LoginFunction(String userName, String Password) {
		WebElement userNameInputField = driver.findElement(By.id("user-name"));
		userNameInputField.sendKeys(userName);
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("Password");
		driver.findElement(By.id("login-button")).click();
		
	
	}


	

}
