
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyFirstClass1 extends Parameters{

	@Test 
	public void colorPicker () {
		
		Actions act = new Actions(driver);
		
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);

		WebElement redSlider = driver.findElement(By.xpath("//*[@id=\"red\"]/span"));
		act.dragAndDropBy(redSlider, -120,50 ).click().perform();
		
		WebElement greenSlider = driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
		act.dragAndDropBy(greenSlider, -110, 70).click().perform();
		
		WebElement blueSlider = driver.findElement(By.xpath("//*[@id=\"blue\"]/span"));
		act.dragAndDropBy(blueSlider, -50, 120).click().perform();
		
	}
		
		
		
		
		
		
		
		

	}


