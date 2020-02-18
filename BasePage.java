using OpenQA.Selenium;  
using OpenQA.Selenium.Chrome;  
using OpenQA.Selenium.Support.UI;  
using System;  
using System.Collections.Generic;  
using System.Linq;  
using System.Text;  
using System.Threading;  
using System.Threading.Tasks; 


public class BasePage : Driver  {

	public WebActions webAction;

	public WebActions getAction(){
	
	return webAction = new WebActions();
	
}

}