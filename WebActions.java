using OpenQA.Selenium;  
using OpenQA.Selenium.Chrome;  
using OpenQA.Selenium.Support.UI;  
using System;  
using System.Collections.Generic;  
using System.Linq;  
using System.Text;  
using System.Threading;  
using System.Threading.Tasks; 

public class WebActions   {
	

	Waits wait = new Waits();
	
	public void clickOnElement(IWebElement element, String elementName){
		
		try{
			
			wait.waitTillElementGetsVisible(element);
			element.click();
		}catch(Exception e){
		
		
	   }

   }
	
	
  public void setText(IWebElement element,String text, String elementName){
	  
	  try{
		  wait.waitTillElementGetsVisible(element);
		  element.sendKeys(text);
		  
	  }catch(Exception e){
		
      }
  }
  
  
  public boolean isElementDisplayed(IWebElement element, String elementName){
	  
	  
	  boolean b = false;
	  
	  try{
		b= element.isDisplayed(); 
		  return b;
	  }catch(Exception e){
		  
		
	  }
	  return b; 
  }
	

}
