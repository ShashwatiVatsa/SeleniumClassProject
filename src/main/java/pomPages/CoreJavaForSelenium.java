package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSelenium {

	@FindBy(xpath = "(//img[@id='image-3'])[2]")
	private WebElement corejavasele;
		
	public CoreJavaForSelenium(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void corejavaselenium() {
		corejavasele.click();
	}
}
