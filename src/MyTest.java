
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTest extends Parameters {

	@BeforeMethod
	public void mySetup() {
		driver.get(Url);
	} 

	@Test()
	public void LoginWithStandardUSer() throws InterruptedException {
		
		LoginFunction(StandardUserName,passWord );
//		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(3000);
//		driver.findElement(By.id("logout_sidebar_link")).click();

	}

	@Test()
	public void LoginWithProblemUser() throws InterruptedException {
		LoginFunction(ProblemUserName,passWord );
		Thread.sleep(3000);

		
	}

	@Test()
	public void LoginWithPerformanceUser() throws InterruptedException {
		LoginFunction(PerformanceUserName,passWord );
		Thread.sleep(3000);

		

	}

	@AfterMethod
	public void myPostTesting() {

	}
}
