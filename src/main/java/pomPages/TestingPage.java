package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {

	@FindBy(xpath = "//img[@id='munit testing ']")
	private WebElement junit;
	
	@FindBy(xpath="//div[@id='cartArea']")
	private WebElement mycart;
	
	@FindBy(xpath = "(//i[@class='fa fa-facebook'])[1]")
	private WebElement fbiconloc;
		
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getJunit() {
		return junit;
	}

	public WebElement getMycart() {
		return mycart;
	}
	
	public void fbicon() {
		fbiconloc.click();
	}
}
