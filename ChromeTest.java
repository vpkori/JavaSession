import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set the path of the ChromeDriver executable
		
	     // System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM JAR FILES\\chromedriver_win32\\chromedriver.exe");

	      // Create a new instance of the ChromeDriver
	      WebDriver driver = new ChromeDriver();

	      // Navigate to the website
	      driver.get("https://www.google.com");

	      // Close the browser
	      driver.quit();

	}
}
