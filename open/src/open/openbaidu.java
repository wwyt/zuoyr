package open;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
	public class openbaidu {
		@Test
			  public static void setUp() throws Exception {
			
			  System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				String url="https://www.baidu.com";//打开百度
				driver.get(url);
		    driver.findElement(By.id("kw")).sendKeys("江西");
			driver.findElement(By.id("su")).click();	
		}
		}

