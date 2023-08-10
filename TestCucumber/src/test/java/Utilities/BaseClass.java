package Utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import Constants.Constant;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BaseClass {
	
	Constant cons=new Constant();
	static WebDriver driver;
	
	public static  WebDriver  InitializeDriver() 
	{
		 
		 driver=new ChromeDriver();
		
		 WebDriverManager.chromedriver().setup();
		   
		   driver.manage().window().maximize();
		  
			try {
				driver.get(GetDataFromExcel.getURL());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return driver;
	}
	
	public  static void takescreenshot() throws IOException
	{
		
		TakesScreenshot Srcshot=(TakesScreenshot)(driver);
		File SrcFile=Srcshot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(Constant.SCREENSHOTPATH);
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	
	public void ScrollDown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
	}
	
	
	public void Implicitwaitvalue()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	

	
	
	
	
  
	
	

}
