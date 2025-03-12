package com.rameshsoftautomation.TestngPrograms;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public interface ScreenShotUtilty {
    public static void screenshot(String imageName, WebDriver driver) throws IOException {
        if (driver == null) {
            throw new IllegalArgumentException("WebDriver instance is null");
        }
        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\screenshots\\" + imageName + ".jpeg"));
    }
}




/*package com.rameshsoftautomation.TestngPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public interface ScreenShotUtilty {
    public static void screenshot(String imageName , WebDriver d) throws IOException {
        TakesScreenshot t = (TakesScreenshot) d;
        File file = t.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\screenshots " + imageName + ".jpeg"));
    }
}



*/



/*package com.rameshsoftautomation.TestngPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public interface ScreenShotUtilty
{
	public static void screenshot(String imageName , WebDriver d) throws IOException
	{
		TakesScreenshot t = (TakesScreenshot) d;
		File file = t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("D:\\RameshSoft2directory\\Rameshsoft Revision\\JavaWithSeleniumPrograms\\screenshots " + imageName + ".jpeg"));
	}
}*/
