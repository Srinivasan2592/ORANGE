package Orange_HRM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class Baseclass 
{
	public static WebDriver driver;
	public static WebDriverManager manager;
	public static Properties prop;

	public static void Browserlaunch() throws IOException {

		File file = new File("C:\\Users\\PK181\\eclipse-workspace\\Orange_HRM.org\\property_file\\config.properties");
		FileInputStream fileinput = null;
		fileinput = new FileInputStream(file);

		Properties prop = new Properties();
		prop.load(fileinput);
		prop.getProperty("browser");

		if (prop.getProperty("browser").equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void verifyurl() throws IOException {

		List<WebElement> allURLs = driver.findElements(By.tagName("a"));
		System.out.println("Total links on the Wb Page: " + allURLs.size());

		for (int i = 0; i < allURLs.size(); i++) {
			WebElement E1 = allURLs.get(i);
			String url1 = E1.getAttribute("href");
			verifyLinks(url1);
		}
	}

	public static void verifyLinks(String linkUrl) {
		try {
			URL url = new URL(linkUrl);

			// Now we will be creating url connection and getting the response code
			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
			httpURLConnect.setConnectTimeout(5000);
			httpURLConnect.connect();
			if (httpURLConnect.getResponseCode() >= 400) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + "is a broken link");
			}

			// Fetching and Printing the response code obtained
			else {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
			}
		} catch (Exception e) {
		}
	}

	public static void image_verification() throws IOException {

		List<WebElement> allimg = driver.findElements(By.tagName("img"));
		System.out.println("Total links on the Wb Page: " + allimg.size());

		for (int i = 0; i < allimg.size(); i++) {
			WebElement E2 = allimg.get(i);
			String E21 = E2.getAttribute("src");
			boolean img = E2.isDisplayed();
			System.out.println(E21 + "----" + img);

		}
	}

	public static void impliciwait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void explicitwait() {
		WebDriverWait wait = new WebDriverWait(driver, 50);
	}
	public static void getcurrenturl() {
		String currenturl = driver.getCurrentUrl();
		System.out.println("Currrent URL is : "+currenturl);
	}
	public static void gettitle() {
		String title = driver.getTitle();
		System.out.println("Title for Current tab "+title);
	}

	public static void closing_Tab() {
		driver.close();
	}

	public static void quit_browser() {
		driver.quit();
	}

	public static void getOptions(WebElement element) {
		Select s1 = new Select(element);
		List<WebElement> options = s1.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement element2 = options.get(i);
			String text = element2.getText();
			System.out.println(text);
		}
	}
	public static String gettext(WebElement element) {
		return element.getText();
	}

	public static void entertext(WebElement element,int timeout, String text) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		JavascriptExecutor js = (JavascriptExecutor) driver; js.
		executeScript("arguments[0].style.border='3px solid red'", element);
		element.sendKeys(text);

	}

	public static void buttonclick(int timeout,WebElement element) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		JavascriptExecutor js = (JavascriptExecutor) driver; js.
		executeScript("arguments[0].style.border='3px solid red'", element);
		element.click();

	}

	public static void selectById(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public static void mousehover(WebElement element) {
		//Actions action=new Actions(element);
		//action.doubleClick();
	}
	public static void Screeshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File Myfolder = new File("C:\\Users\\PK181\\Downloads\\screenshot\\homePageScreenshot.jpg");
		FileUtils.copyFile(screenshotAs, Myfolder);
		System.out.println(Myfolder + " :sucessfully Screenshort taken");
		
	}
}
