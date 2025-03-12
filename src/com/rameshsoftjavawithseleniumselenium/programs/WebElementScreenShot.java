/*package com.rameshsoftSelenium.programs;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebElementScreenShot {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\RameshSoftRevision\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://only-testing-blog.blogspot.com/2014/09/selectable.html");
    }

    @Test
    public void captureScreenShot() {
        WebElement image = driver.findElement(By.xpath("//img[@border = '0']"));
        try {
            captureElementScreenShot(image);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void captureElementScreenShot(WebElement element) throws IOException {
        File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        int width_Image = element.getSize().getWidth();
        int height_Image = element.getSize().getHeight();

        Point point = element.getLocation();

        int xcordinate = point.getX();
        int ycordinate = point.getY();

        BufferedImage img = ImageIO.read(screen);

        BufferedImage dest = img.getSubimage(xcordinate, ycordinate, width_Image, height_Image);

        ImageIO.write(dest, "png", screen);

        FileUtils.copyFile(screen, new File("D:\\RameshSoft Automation Testing\\Screenshot.png"));
    }
}
*/


package com.rameshsoftjavawithseleniumselenium.programs;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebElementScreenShot
{	
	
	WebDriver driver;
		@BeforeTest
		public void setup() 
		{			
			System.setProperty("webdriver.gecko.driver", "D:\\RameshSoft2directory\\Rameshsoft Revision\\RameshSoftRevision\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://only-testing-blog.blogspot.com/2014/09/selectable.html");
		}	
		
		@Test
		public void captureScreenShot() throws Exception
		{
			//WebDriver driver = new FirefoxDriver();
			//locate webelement to capture screenshot
			WebElement image = driver.findElement(By.xpath("//img[@border = '0']"));
			
			//call capture element screenshot() to capture screenshot of element.
			
		}
		
		public void captureElementScreenShot(WebElement element) throws IOException
		{
			//capture entire page screenshot as buffer
			//used TakeScreenshot, outputType interface of selenium and file class of
			//java to capture screenshot of entire page
			//WebDriver driver = new FirefoxDriver();
			File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			int width_Image  = element.getSize().getWidth();
			int height_Image = element.getSize().getHeight();
			System.out.println(width_Image);
			System.out.println(height_Image);
			
			Point point = element.getLocation();
			
			int xcordinate = point.getX();
			int ycordinate = point.getY();
			System.out.println(xcordinate);
			System.out.println(ycordinate);
			
			BufferedImage img = ImageIO.read(screen);
			
			BufferedImage dest = img.getSubimage(xcordinate, ycordinate, width_Image, height_Image);
			
			ImageIO.write(dest, "png", screen);
			
			FileUtils.copyFile(screen, new File("D:\\RameshSoft Automation Testing\\Screenshot.png"));			
		}
}
