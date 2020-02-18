using OpenQA.Selenium;  
using OpenQA.Selenium.Chrome;  
using OpenQA.Selenium.Support.UI;  
using System;  
using System.Collections.Generic;  
using System.Linq;  
using System.Text;  
using System.Threading;  
using System.Threading.Tasks; 


public class Waits {
	
	
	WebDriverWait wait = new WebDriverWait(Driver.getDriver(),120);
	
	
	public void waitTillElementGetsVisible(IWebElement element){
		
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitTillElementGetsinvisible(IWebElement element){
		
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

}
