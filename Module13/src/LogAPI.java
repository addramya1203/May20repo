import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LogAPI {
	public static WebDriver driver;

	public static void main(String[] args) {
	
		
System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\IBM_ADMIN\\\\Desktop\\\\selenium_practical\\\\geckdriver\\\\geckodriver.exe");
		
		 driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Log.info("opening url");
		driver.get("http://qtpselenium.com/home/contact_trainer");
	
		WebElement dropdown=driver.findElement(By.xpath("//*[@name='country_id']"));
		Select s= new Select(dropdown);
	
		s.selectByValue("12");
	
		
		
		 
		

	}

}
