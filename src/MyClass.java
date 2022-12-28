import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Toshiba-com\\Desktop\\udemyfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.booking.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"ss\"]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"ss\"]")).sendKeys("amman");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"ss\"]")).sendKeys(""+Keys.ARROW_DOWN + Keys.ENTER);
	

	}

}
