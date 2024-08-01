import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


		Driver.get("https://admin:admin@the-internet.herokuapp.com");	
		Driver.findElement(By.linkText("Basic Auth")).click();
		Thread.sleep(3000);
	}

}
