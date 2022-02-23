package testscript;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoreJavaForSelenium;
import pomPages.CourseVideos;
import pomPages.SkillraryLoginPage;

public class Testcase3 extends BaseClass {

	@Test
	public void tc1() throws IOException, InterruptedException {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.typeinsearchtb(pdata.getPropertyFiledata("course"));
		s.clicksearchbtn();

		CoreJavaForSelenium c = new CoreJavaForSelenium(driver);
		c.corejavaselenium();

		CourseVideos cv = new CourseVideos(driver);
		cv.closecookies();
		driverutilies.switchframe(driver);
		cv.clicktoplay();
		Thread.sleep(10000);
		cv.clicktopause();
		driverutilies.switchbackframe(driver);

		
		Point twitloc = cv.getShareviatwit().getLocation();
		int twitx=twitloc.getX();
		int twity=twitloc.getY();
		System.out.println(twitx);
		System.out.println(twity);
		driverutilies.scrollBar(driver, twitx-200, twity-200);
		 
		/*
		 * ((JavascriptExecutor)
		 * driver).executeScript("arguments[0].scrollIntoView(true);", cv.shareviatwit);
		 * Thread.sleep(500)
		 */
		cv.shareviatwitter();

	}
}
