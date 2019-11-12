package base;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {

	/*
	 * public static WebDriver driver;
	 * 
	 * @Parameters({"browser"})
	 * 
	 * @BeforeMethod public void openBrowser(String browserName) {
	 * 
	 * if (browserName.equalsIgnoreCase("chrome")) {
	 * System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 * driver = new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://leaftaps.com/opentaps/control/main"); }
	 * 
	 * else { System.setProperty("webdriver.opera.driver",
	 * "./drivers/operadriver.exe"); driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.get("http://leaftaps.com/opentaps/control/main");
	 * 
	 * }
	 * 
	 * }
	 */
	
	
public static ChromeDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

	}

	@AfterMethod
	public void closeBroswer() {
		driver.close();

	}

}
