package OpenKart;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
public class MainTest {
	
	
	public class LoginTest extends Credentials{
			 WebDriver driver;
			 WebDriver wait;
	
	@BeforeClass
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
	}
	
	@Test
	public void Login() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.textToBePresentInElementValue(driver.findElement(By.xpath("//a[text()='ProtoCommerce']")), "ProtoCommerce"));
		WebElement UserName=driver.findElement(By.xpath("(//input)[1]"));
		UserName.sendKeys(name());
		WebElement Email=driver.findElement(By.xpath("(//input)[2]"));
		Email.sendKeys(getMail());
		WebElement Password=driver.findElement(By.id("exampleInputPassword1"));
		Password.sendKeys(getPassword());
		WebElement Checkbox=driver.findElement(By.id("exampleCheck1"));
		Checkbox.click();
		System.out.println(Checkbox.isSelected());
		String TextBox_Message=driver.findElement(By.xpath("//label[@class='form-check-label' and text()='Check me out if you Love IceCreams!']")).getText();
		System.out.println(TextBox_Message);
		WebElement sex=driver.findElement(By.id("exampleFormControlSelect1"));
		Select dp = new Select(sex);
		dp.selectByVisibleText(getGender());
		Thread.sleep(2000);
		System.out.println(sex.getText());
		driver.findElement(By.xpath("(//div[@class='form-group'])[5]/div[2]/input")).click();
		WebElement DOB=driver.findElement(By.xpath("//input[@name='bday']"));
		DOB.sendKeys(getdateofbirth());
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	String success=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']/strong")).getText();
		System.out.println(success);
		
		
	}
	
	@AfterTest
	public void TearDown() {
		
		driver.quit();
	}
			
			
			
	}

}
