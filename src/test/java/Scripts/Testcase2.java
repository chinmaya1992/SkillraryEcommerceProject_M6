package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass{
	
	@Test
	public void tc2() throws Throwable {
		
		SkillraryLoginPage slp = new SkillraryLoginPage(driver);
		slp.gearsbutton();
		slp.skillrarydemoapp();
		
		SkillraryDemoLoginPage sdlp = new SkillraryDemoLoginPage(driver);
		utilies.switchingtabs(driver);
		utilies.dropDown(sdlp.getCoursedd(),pdata.getPropertydata("coursedd"));
		TestingPage tp = new TestingPage(driver);
		utilies.dragdrop(driver, tp.getSeleniumtng(), tp.getMycrt());
		
		
		
	}

}
