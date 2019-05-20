import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static  void main(String[] args) throws InterruptedException {

		//select,count
		
System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\IBM_ADMIN\\\\Desktop\\\\selenium_practical\\\\geckdriver\\\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://qtpselenium.com/home/contact_trainer");
		
	//	driver.findElement(By.xpath("//*[@name='country_id']")).click();
	//	driver.findElement(By.xpath(".//*[@id='lang-chooser']/div[2]/div[3]")).click();
		
		
		//List<WebElement> list1
		WebElement dropdown=driver.findElement(By.xpath("//*[@name='country_id']"));
		Select s= new Select(dropdown);
	//	s.selectByIndex(3);
	//	s.selectByVisibleText("India");
		s.selectByValue("12");
		//System.out.println("options are--->"+list1.get(2));
		
		
		//*[@id='lang-chooser']/div[1]/div[1]/div[10]
		
		//Thread.sleep(1000);
		
		//List<WebElement> options=list1.findElements(By.tagName("option"));
		//System.out.println("total options are---->"+options.size());*/
		
		
		
		
	}

}
