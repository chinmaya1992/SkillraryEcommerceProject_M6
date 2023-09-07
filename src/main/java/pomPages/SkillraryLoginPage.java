package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	
	//Declaration
	//Address of gears
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearbtn;
	//Address of skillrary demo
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement Skillrarydemoapp;
	//Address of search text field
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchtb;
	//Address of search icon
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	
	//Initialization
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void gearsbutton() {
		gearbtn.click();
	}
	public void skillrarydemoapp() {
		Skillrarydemoapp.click();
	}
	public void searchTextbox(String name) {
		searchtb.sendKeys(name);
	}
	public void gobutton() {
		searchbtn.click();
	}

}
