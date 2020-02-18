using OpenQA.Selenium;  
using OpenQA.Selenium.Chrome;  
using OpenQA.Selenium.Support.UI;  
using System;  
using System.Collections.Generic;  
using System.Linq;  
using System.Text;  
using System.Threading;  
using System.Threading.Tasks; 

public class Driver {
	
	private static String driverpath = "src/test/resources/Drivers/";
	public static IWebDriver driver = null;
	
	public static IWebDriver setDriver(String browserType){
		
		switch (browserType){
		
		case "firefox":
			 driver = new FirefoxDriver();
			 break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", driverpath+"chromedriver.exe");
			 driver = new ChromeDriver();
			 break;
		case "IE":
			System.setProperty("webdriver.ie.driver", driverpath+"IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			 break;
		default:
			System.setProperty("webdriver.ie.driver", driverpath+"IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
							
		}
		
		return driver;
			
	}
	
	public static IWebDriver getDriver(){
		
		return driver;
	}
		

}
