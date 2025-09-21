package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchScreen extends BaseScreen {
    public SearchScreen(AppiumDriver<AndroidElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='More options']")
    AndroidElement btnDots;
    @FindBy(xpath = "//*[@text='Registration' and @resource-id = 'com.telran.ilcarro:id/title']")
    AndroidElement btnRegistration;
    @FindBy(xpath = "//*[@text='Login' and @resource-id= 'com.telran.ilcarro:id/title']")
    AndroidElement btnLogin;
    @FindBy(xpath = "//hierarchy/android.widget.Toast")
    AndroidElement popUpMessageSuccess;
    @FindBy(xpath = "//*[@text='My Cars' and @resource-id= 'com.telran.ilcarro:id/title']")
    AndroidElement btnMyCars;

    public void clickBtnDots(){clickWait(btnDots,5);}
    public void clickBtnRegistration(){clickWait(btnRegistration,5);}
    public void clickBtnLogin(){clickWait(btnLogin,5);}

    public boolean textInElementPresent_popUpMessageSuccess( String text) {
        return  textInElementPresent(popUpMessageSuccess,text, 3);
    }

    public void clickBtnMyCars(){
        clickWait(btnMyCars,3);
    }
}