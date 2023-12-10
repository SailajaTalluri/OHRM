package Excel_OhrmPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
public class BaseTest {
WebDriver driver;
String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
@Test
public void setUp()
{
	//Automating the Browser
	System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Desktop\\OHRMAutomation\\WebApplicationTestingProject\\browserDriverFiles\\msedgedriver.exe");
	driver=new EdgeDriver();
	//Navigating to orangeHrmApplication url
	driver.get(ApplicationUrlAddress);
	driver.manage().window().maximize();	
}
}







