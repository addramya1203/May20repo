import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class manageinputfields {
	//operations on a input field - type- use sendKeys() function,clear - clear(),read-
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\IBM_ADMIN\\\\Desktop\\\\selenium_practical\\\\geckdriver\\\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://google.com");
	//	driver.findElement(By.xpath("//*[@id='gs_htif0']")).sendKeys("games");
		//driver.findElement(By.xpath("//*[@id='gs_htif0']")).clear();
		String text =driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).getAttribute("value");
		System.out.println(text);
		
		
		
		
}
}

