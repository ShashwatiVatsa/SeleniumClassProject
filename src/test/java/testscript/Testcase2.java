package testscript;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass {

	@Test
	public void tc1() throws IOException
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillrarydemoapp();
		
		SkillraryDemoApp d=new SkillraryDemoApp(driver);
		driverutilies.switchingTabs(driver);
		driverutilies.dropDown(d.getSelectcategory(), pdata.getPropertyFiledata("selectcategory"));
		
		TestingPage t=new TestingPage(driver);
		driverutilies.dragdrop(driver, t.getJunit(), t.getMycart());
		
		Point fbloc = t.getFbiconloc().getLocation();
		int fbx=fbloc.getX();
		int fby=fbloc.getY();
		driverutilies.scrollBar(driver, fbx, fby);
		t.fbicon();
		
		//Assert.assertEquals(driver.getTitle(), pdata.getPropertyFiledata("fbtitle"));
	}
}
