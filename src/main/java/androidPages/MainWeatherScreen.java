package androidPages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainWeatherScreen extends AndroidPageBase {
    public MainWeatherScreen(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(id = "com.info.weather.forecast:id/iv_temp_dropdown")
    WebElement TempList;
    @AndroidFindBy(xpath = "//android.widget.TextView[@index='1' and @package='com.info.weather.forecast' and @text='F']")
    WebElement FTempUnit;
    @AndroidFindBy(id="com.info.weather.forecast:id/tv_timeformat_setting")
    WebElement TimeFormatList;
    @AndroidFindBy(xpath="//android.widget.TextView[@index=0 and @package='com.info.weather.forecast' and @text='12 Hour']")
    WebElement twelveTimeFormat;
    @AndroidFindBy(id = "com.info.weather.forecast:id/tv_button_done")
    WebElement DoneBtn;
    @AndroidFindBy(id = "com.info.weather.forecast:id/ll_got_it")
    WebElement gotIt;
    @AndroidFindBy(id  ="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    WebElement WhileUsingAppBtn;

    public void pressOnTempList(){
        click(TempList);
    }
    public void selectFTempUnit(){
        click(FTempUnit);
    }
    public void pressOnTimeFormatList(){
        click(TimeFormatList);
    }
    public void selectTimeFormat(){
        click(twelveTimeFormat);
    }
    public void pressDone(){
        click(DoneBtn);
    }
    public void pressOnGotIt(){click(gotIt);}
    public void pressOnWhileUsingAppBtn(){click(WhileUsingAppBtn);}

    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout[1]/" +
            "android.widget.HorizontalScrollView/android.widget.LinearLayout/" +
            "android.widget.LinearLayout/android.widget.LinearLayout[1]")
    public WebElement endElement;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout[1]" +
            "/android.widget.HorizontalScrollView/android.widget.LinearLayout/" +
            "android.widget.LinearLayout/android.widget.LinearLayout[5]")
   public WebElement startElement;
    public void swipeHorizontal(WebElement startElement, WebElement endElement, AndroidDriver driver) {
        int startX = startElement.getLocation().getX() + startElement.getSize().getWidth() / 2;
        int endX = endElement.getLocation().getX() + endElement.getSize().getWidth() / 2;
        int centerY = (startElement.getLocation().getY() + endElement.getLocation().getY()) / 2;

        TouchAction touchAction = new TouchAction(driver);
        touchAction
                .press(ElementOption.element(startElement, startX, centerY))
                .moveTo(ElementOption.element(endElement, endX, centerY))
                .release()
                .perform();
    }



}
