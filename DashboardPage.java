using OpenQA.Selenium;  
using OpenQA.Selenium.Chrome;  
using OpenQA.Selenium.Support.UI;  
using System;  
using System.Collections.Generic;  
using System.Linq;  
using System.Text;  
using System.Threading;  
using System.Threading.Tasks; 


public class DashboardPage : BasePage {
	
	public IWebDriver driver;
	
	 public  By signupClick = By.XPath("//*[@id='ctl00_HeaderHomeNewDesign_Login1_HyperLinkRegister']");  
     public  By email = By.Name("ctl00$ContentMain$TextBoxEmail");  
     public  By firstName = By.Name("ctl00$ContentMain$TextBoxFirstName");  
     public  By lastName = By.Name("ctl00$ContentMain$TextBoxLastName");  
     public  By password = By.XPath("//*[@id='ctl00_ContentMain_TextBoxPassword']");  
     public  By confirmPassword = By.Name("ctl00$ContentMain$TextBoxPasswordConfirm");  
     public  By countryDropdown = By.Name("ctl00$ContentMain$DropdownListCountry");  
     public  By zipCode = By.Name("ctl00$ContentMain$TextBoxZip");  
     public  By city = By.Name("ctl00$ContentMain$TextBoxCity");  
     public  By securityQuestion = By.Name("ctl00$ContentMain$DropdownListSecurityQuesion");  
     public  By upgradeBtn = By.Id("ctl00_ContentMain_TextBoxAnswer");  
    
	
	public DashboardPage(IWebDriver driver){
		this.driver= Driver.getDriver();
		
	}
	
	public Boolean isLoginSuccessful(){
		
		Boolean b =getAction().isElementDisplayed(upgradeBtn, "Upgrade Button");
		return b;
	}
}
