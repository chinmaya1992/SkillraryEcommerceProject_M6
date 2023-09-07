package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
	//Declaration
	//Address of plus button
	@FindBy(id="add")
	private WebElement addbtn;
	
	//Address of addtocart button
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement cartbtn;
	
	//Initialization
		public AddToCartPage(WebDriver driver) {
			PageFactory.initElements(driver, this);	
			}
		
		//Utlization
		public WebElement getAddbtn() {
			return addbtn;
		}
	    public void addtocart() {
	    	cartbtn.click();
	    }
	   
}
