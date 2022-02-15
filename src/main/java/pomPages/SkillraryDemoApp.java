package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoApp {

	@FindBy(id = "course")
	private WebElement coursetab;
	
	@FindBy(xpath = "(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtraining;
	
	@FindBy(name = "addresstype")
	private WebElement selectcategory;
	
	public SkillraryDemoApp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCoursetab() {
		return coursetab;
	}
	
	public void seleniumtrainingtab() {
		seleniumtraining.click();
	}

	public WebElement getSelectcategory() {
		return selectcategory;
	}
}
