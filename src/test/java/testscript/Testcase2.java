package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass {

	@Test
	public void tc1() throws IOException, InterruptedException
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillrarydemoapp();
		
		SkillraryDemoApp d=new SkillraryDemoApp(driver);
		driverutilies.switchingTabs(driver);
		driverutilies.dropDown(d.getSelectcategory(), pdata.getPropertyFiledata("selectcategory"));
		
		TestingPage t=new TestingPage(driver);
		driverutilies.dragdrop(driver, t.getJunit(), t.getMycart());
		
		t.fbicon();
		Thread.sleep(5000);
		
		Assert.assertEquals(driver.getTitle(), pdata.getPropertyFiledata("fbtitle"));
		Reporter.log(driver.getTitle(),true);
	}
}
