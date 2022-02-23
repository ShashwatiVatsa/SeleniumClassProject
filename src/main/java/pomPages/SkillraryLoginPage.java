package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gearsBtn;
	
	@FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoApp;
	
	@FindBy(name = "q")
	private WebElement searchtb;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement searchbtn;
	
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void gearsButton() {
		gearsBtn.click();
	}
	
	public  void skillrarydemoapp() {
		demoApp.click();
	}
	
	public void typeinsearchtb(String search) {
		searchtb.sendKeys(search);
	}
	
	public void clicksearchbtn() {
		searchbtn.click();
	}
}
