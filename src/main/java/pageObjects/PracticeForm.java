package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PracticeForm {

	public PracticeForm(WebDriver driver){
	  PageFactory.initElements(driver, this);	
	}
	
	@FindBy(how = How.ID, using = "firstName") 
	private WebElement firstName;
	
	@FindBy(how = How.ID, using = "lastName") 
	private WebElement lasttName;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Male']/following-sibling::label") 
	private WebElement sex_Male;

	@FindBy(how = How.XPATH, using = "//input[@value='Female']/following-sibling::label") 
	private WebElement sex_Female;	
	
	
	public void fillFormDeatials(String fName,String lName,String sex,String yearsOfexp,String Date,String profison) throws Exception {
		
		firstName.sendKeys(fName);
		 lasttName.sendKeys(lName);
		 
		 if(sex.equalsIgnoreCase("Male")) {
			 sex_Male.click();
		 }else {
			 sex_Female.click();
		 }
		 
		 throw new Exception();
	}
	
	
}
