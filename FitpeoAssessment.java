package fitpeocompany;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FitpeoAssessment {
	WebDriver wait;
	public static void main(String[] args) throws Throwable 
	{
//firstly i choose to set path for run all script in my class
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();//created ob
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));


		driver.get("https://www.fitpeo.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://fitpeo.com/revenue-calculator");
		JavascriptExecutor js = (JavascriptExecutor)driver;//to mover cursor  over the specified page locaation i use  JavascriptExcecutor class
		js.executeScript("window.scrollBy(0,440)");
		Thread.sleep(3000);
		WebElement slider = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/span[1]/span[3]"));


		Actions action = new Actions(driver);//to perfoem the mouse actions over the slider i used Actions class
		action.dragAndDropBy(slider, 94, 0).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@value='822'])[1]")).sendKeys(Keys.ARROW_LEFT,Keys.ARROW_LEFT);// i used here the Keys class to perform the expected operation on the slider   
//when i set the value of the patient 820 then Total Recurring Reimbursement for all Patients Per Month:$110700 has displayed.

		Thread.sleep(15000);
		driver.findElement(By.id(":R57alklff9da:")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,"560");



		JavascriptExecutor jd = (JavascriptExecutor)driver;
		jd.executeScript("window.scrollBy(0,460)");

		WebElement chechbox1 =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/label/span[1]/input"));


		if (!chechbox1.isSelected())//to select specified checkbox i have used isSelected() method 
 		{chechbox1.click();
		}


		WebElement chechbox2=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/label/span[1]/input"));


		if (!chechbox2.isSelected())
		{chechbox2.click();
		}


		WebElement chechbox3 =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/label/span[1]/input"));


		if (!chechbox3.isSelected())
		{chechbox3.click();
		}


		WebElement chechbox4 =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[8]/label/span[1]/input"));


		if (!chechbox4.isSelected())
		{chechbox4.click();
		}




	}
}
