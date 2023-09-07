package Scripts;

import org.testng.annotations.Test;
import GenericLibrary.BaseClass;
import pomPages.AddToCartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass{
	
	@Test
	public void tc1() {
		SkillraryLoginPage slp = new SkillraryLoginPage(driver);
		slp.gearsbutton();
		slp.skillrarydemoapp();
		utilies.switchingtabs(driver);
		SkillraryDemoLoginPage sdlp = new SkillraryDemoLoginPage(driver);
		utilies.mouseHover(driver, sdlp.getCourstab());
		sdlp.seleniumtrainingtab();
		AddToCartPage atcp = new AddToCartPage(driver);
		utilies.doubleClick(driver, atcp.getAddbtn());
	    atcp.addtocart();
	    utilies.alterPopup(driver);
	}

}
