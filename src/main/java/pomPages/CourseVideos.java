package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseVideos {

	@FindBy(xpath = "//a[@class='close_cookies']")
	private WebElement cookies;
	
	@FindBy(xpath = "//div[@class='play-icon']")
	private WebElement play;
	
	@FindBy(xpath = "//div[@class='pause-icon']")
	private WebElement pause;
	
	@FindBy(xpath = "//span[text()='Share via Twitter']")
	public WebElement shareviatwit;
	
	public CourseVideos(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void closecookies() {
		cookies.click();
	}
	
	public void clicktoplay() {
		play.click();
	}
	
	public void clicktopause() {
		pause.click();
	}
	
	public void shareviatwitter() {
		shareviatwit.click();
	}

	public WebElement getShareviatwit() {
		return shareviatwit;
	}
}
