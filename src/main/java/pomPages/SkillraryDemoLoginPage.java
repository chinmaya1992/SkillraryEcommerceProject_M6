package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {
	
	//Declaration
	//Address of course webelement
	@FindBy(id="course")
	private WebElement courstab;
	//Address of selenium training
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtraining;
	//address of drop down
	@FindBy(id="addresstype")
	private WebElement coursedd;
	
	//Initialization
	public SkillraryDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	
	//Utilization
	public WebElement getCourstab() {
		return courstab;
	}	
	public void seleniumtrainingtab() {
		seleniumtraining.click();
	}
	public WebElement getCoursedd() {
		return coursedd;
	}
	
}
