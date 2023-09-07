package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	//Declaration
		//Address of course seleniumtraining
			@FindBy(xpath="//img[@src='images/selenium-training.jpeg']")
			private WebElement seleniumtraining;
		//Address of my cart
			@FindBy(id="//div[@id='cartArea']")
		    private WebElement carttab;
		//Address of facebook icon
			@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
		    private WebElement facebook;
			
		//Initialization
			public TestingPage(WebDriver driver) {
				PageFactory.initElements(driver, this);	
				}

			
		//Utilization
			public WebElement getSeleniumtng() {
				return seleniumtraining;
			}
			public WebElement getMycrt() {
				return carttab;
			}
			public WebElement getFacebook() {
				return facebook;
			}
			public void facebookicon() {
				facebook.click();
			}

}
