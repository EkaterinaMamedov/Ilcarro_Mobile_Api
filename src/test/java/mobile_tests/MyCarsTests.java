package mobile_tests;

import config.AppiumConfig;
import dto.RegistrationBodyDto;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screens.*;

import java.util.Random;

public class MyCarsTests extends AppiumConfig {

    @BeforeMethod
    public void registrationPositiveTest() {
        int i = new Random().nextInt(1000);
        RegistrationBodyDto user = RegistrationBodyDto.builder()
                .firstName("Vanya")
                .lastName("Ivanov")
                .userName("vanya" + i + "ivanov@gmail.com")
                .password("AAaaa!" + i)
                .build();

        System.out.println(user.toString());
        new SplashScreen(driver).goToSearchScreen(5);
        SearchScreen searchScreen = new SearchScreen(driver);
        searchScreen.clickBtnDots();
        searchScreen.clickBtnRegistration();
        RegistrationScreen registrationScreen = new RegistrationScreen(driver);
        registrationScreen.typeRegistrationForm(user);
        registrationScreen.clickCheckBox();
        registrationScreen.clickBtnYalla();

        Assert.assertTrue(searchScreen
                .textInElementPresent_popUpMessageSuccess("Registration success!"));

    }

    @Test
    public void addNewCarPositiveTest() {
        SearchScreen searchScreen = new SearchScreen(driver);

        searchScreen.clickBtnDots();
        searchScreen.clickBtnMyCars();
        MyCarsScreen myCarsScreen = new MyCarsScreen(driver);
        myCarsScreen.clickAddNewCar();
        SelectCarsCapabilitiesScreen selectCarsCapabilitiesScreen = new SelectCarsCapabilitiesScreen(driver);
    }


//    @AfterMethod

}
