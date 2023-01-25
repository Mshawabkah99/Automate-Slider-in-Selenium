import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters {

	
	public WebDriver driver ;
	String URL = "https://jqueryui.com/slider/#colorpicker";
	
	@BeforeTest
	public void before_test() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
	}
	
	
	
	
	
}
