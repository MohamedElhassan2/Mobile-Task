package androidPages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class AndroidPageBase {
    AndroidDriver driver;
    public static final long WAIT = 10;
    public AndroidPageBase(AndroidDriver androidDriver){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        driver= androidDriver;
    }
    public void waitForVisibility(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void click(WebElement element){
        waitForVisibility(element);
        element.click();
    }

}
