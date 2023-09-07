package GenericLibrary;

import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	

	//1.Handlling for dropdown
			public void dropDown(WebElement ele,String text) {
				Select s = new Select(ele);
				s.selectByVisibleText(text);
		}	
			
	//2.Handlling for mouse over
			public void mouseHover(WebDriver driver,WebElement ele) {
				Actions a = new Actions(driver);
				a.moveToElement(ele).perform();
			}

	//3.Handlling for double click
			public void doubleClick(WebDriver driver,WebElement ele) {
				Actions a = new Actions(driver);
				a.moveToElement(ele).perform();
		}
			
	//4.Handlling for right click
			public void rightClick(WebDriver driver,WebElement ele) {
				Actions a = new Actions(driver);
				a.contextClick(ele).perform();
		}
			
	//5.Handlling drag and drop
			public void dragdrop(WebDriver driver,WebElement src,WebElement target) {
				Actions a = new Actions(driver);
				a.dragAndDrop(src,target).perform();
		}	
			
	//6.Shifting control to frame
			public void switchFrame(WebDriver driver) {
				driver.switchTo().frame(0);	
				}
			
	//7.Shifting control back to normal web page
			public void Switchbackframe(WebDriver driver) {
				driver.switchTo().defaultContent();
			}
			
	//8.Shifting control to popup
			public void alterPopup(WebDriver driver) {
				driver.switchTo().alert().accept();
			}
			
	//9.Shifting control to child window
			public void switchingtabs(WebDriver driver) {
				Set<String> child = driver.getWindowHandles();
				for(String b:child) {
				driver.switchTo().window(b);
			}
			}
				
    //10.Handlling scroll bar
			public void scrollBar(WebDriver driver,int x,int y) {
			 JavascriptExecutor js=(JavascriptExecutor) driver;
			 js.executeScript("windows.scrollBy("+x+","+y+")");
				
			}
}

