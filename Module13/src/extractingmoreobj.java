import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class extractingmoreobj {

	public static void main(String[] args) {

		//List is a dynamic datastructure
		
System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\IBM_ADMIN\\\\Desktop\\\\selenium_practical\\\\geckdriver\\\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("http://bbc.com");
		List<WebElement> alinks = driver.findElements(By.tagName("b"));
		
	System.out.println("Total links--->"+alinks.size());
		
		WebElement fifthlink = alinks.get(4);
		System.out.println("Fidfth link"+fifthlink.getText());
		Point loc=fifthlink.getLocation();
		System.out.println("location of fifth link"+loc);
		for(int i=0;i<alinks.size();i++) {
			
			System.out.println(alinks.get(i).getText());
		}
		
		
		
	}

}
