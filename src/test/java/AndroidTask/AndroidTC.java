package AndroidTask;

import androidPages.MainWeatherScreen;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class AndroidTC extends AndroidTestBase {
     MainWeatherScreen mainWeatherScreen;
    @Test
    public void mobileTC() throws MalformedURLException, InterruptedException {
         Android_setUp();
         mainWeatherScreen = new MainWeatherScreen(driver);
         mainWeatherScreen.pressOnTempList();
         mainWeatherScreen.selectFTempUnit();
         mainWeatherScreen.pressOnTimeFormatList();
         mainWeatherScreen.selectTimeFormat();
         mainWeatherScreen.pressDone();
         mainWeatherScreen.pressOnGotIt();
         mainWeatherScreen.pressOnWhileUsingAppBtn();
         mainWeatherScreen.swipeHorizontal(mainWeatherScreen.startElement, mainWeatherScreen.endElement, driver);
    }
}
