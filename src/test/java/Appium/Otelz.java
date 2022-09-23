package Appium;

import com.github.javafaker.Faker;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Otelz {


    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 6");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Bozca\\Desktop\\appiumNew\\src\\test\\java\\Appium\\APP\\Otelz.apk");



        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);
        WebElement ilkTik= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.ImageView"));
        ilkTik.click();
        Thread.sleep(1000);
        WebElement allowBtn=driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
        allowBtn.click();
        WebElement ikinciTik=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.ImageView"));
        ikinciTik.click();
        Thread.sleep(1000);
        WebElement continueBtn=driver.findElement(By.id("com.otelz.mobil:id/materialButtonContinue"));
        continueBtn.click();
        Thread.sleep(2000);
        WebElement searchBox=driver.findElement(By.id("com.otelz.mobil:id/tvSearchHome"));
        searchBox.click();
        Thread.sleep(2000);
        WebElement searchTextBox=driver.findElement(By.id("com.otelz.mobil:id/search_src_text"));
        searchTextBox.sendKeys("Ankara");
        Thread.sleep(2000);
        WebElement centralAnatolia=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]"));
        centralAnatolia.click();
        Thread.sleep(2000);
        WebElement searchBtn=driver.findElement(By.id("com.otelz.mobil:id/llSearchHome"));
        searchBtn.click();
        Thread.sleep(5000);
        WebElement otelName=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[1]"));
        String otelAdi=otelName.getText();
        Thread.sleep(2000);
        Thread.sleep(5000);
        WebElement otelFiyat=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.TextView[3]"));
        String otelFiyati=otelFiyat.getText();
        WebElement otelBtn=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup"));
        otelBtn.click();
        Thread.sleep(2500);
        String actualOtelAdi=driver.findElement(By.id("com.otelz.mobil:id/tvFacilityDetailName")).getText();
        assertTrue(actualOtelAdi.contains(otelAdi));
        WebElement otelAdiWebElement=driver.findElement(By.id("com.otelz.mobil:id/tvFacilityDetailName"));
        Thread.sleep(4000);


        TouchActions actions=new TouchActions(driver);
        actions.scroll(otelAdiWebElement,10,100).perform();
        Thread.sleep(3000);

        WebElement actualOtelFiyatiWebElement =driver.findElement(By.id("com.otelz.mobil:id/tv_best_price_total_price_value"));
        String actualOtelFiyati=actualOtelFiyatiWebElement.getText();
        actualOtelFiyati=actualOtelFiyati.substring(0,5);
        System.out.println("actualOtelFiyati = " + actualOtelFiyati);
        assertTrue(otelFiyati.contains(actualOtelFiyati));
        Thread.sleep(3000);
        WebElement otherRoomBtn=driver.findElement(By.id("com.otelz.mobil:id/view_rating"));
        otherRoomBtn.click();
        Thread.sleep(3000);
        WebElement chooseRoomBtn=driver.findElement(By.id("com.otelz.mobil:id/tvPersonCount"));
        chooseRoomBtn.click();
        Thread.sleep(3000);
        WebElement bookNowBtn=driver.findElement(By.id("com.otelz.mobil:id/btnMakeReservation"));
        bookNowBtn.click();
        Faker faker = new Faker();
        Thread.sleep(3000);
        WebElement nameTextBox=driver.findElement(By.id("com.otelz.mobil:id/tvPersonalInfoName"));
        nameTextBox.sendKeys(faker.name().name());
        Thread.sleep(3000);
        WebElement surnameTextBox=driver.findElement(By.id("com.otelz.mobil:id/tvPersonalInfoSurname"));
        surnameTextBox.sendKeys(faker.name().lastName());
        Thread.sleep(3000);
        WebElement phoneCode=driver.findElement(By.id("com.otelz.mobil:id/etPersonalInfoPhoneCode"));
        phoneCode.click();
        Thread.sleep(3000);
        WebElement phoneCodeSelected=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView"));
        phoneCodeSelected.click();
        Thread.sleep(3000);
        WebElement phoneNumberTextBox=driver.findElement(By.id("com.otelz.mobil:id/tvPersonalInfoPhone"));
        phoneNumberTextBox.sendKeys(faker.phoneNumber().cellPhone());
        Thread.sleep(3000);
        WebElement countryCodeTextBox=driver.findElement(By.id("com.otelz.mobil:id/tvPersonalInfoCountry"));
        countryCodeTextBox.click();
        Thread.sleep(3000);
        WebElement turkeySelected=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView"));
        turkeySelected.click();
        Thread.sleep(3000);
        WebElement saveInfoCheckBox = driver.findElement(By.id("com.otelz.mobil:id/checkBoxSaveInfo"));
        saveInfoCheckBox.click();
        Thread.sleep(3000);
        WebElement nextStepBtn=driver.findElement(By.id("com.otelz.mobil:id/btnPersonalInfoNext2"));
        nextStepBtn.click();
        Thread.sleep(3000);
        WebElement illumnationCheckBox = driver.findElement(By.id("com.otelz.mobil:id/checkBoxIllumination"));
        illumnationCheckBox.click();
        Thread.sleep(3000);
        WebElement permissionCheckBox = driver.findElement(By.id("com.otelz.mobil:id/checkBoxPermission"));
        permissionCheckBox.click();
        Thread.sleep(3000);
        WebElement nextStepIkiBtn=driver.findElement(By.id("com.otelz.mobil:id/btnPersonalInfoNext2"));
        nextStepIkiBtn.click();
        Thread.sleep(3000);
        WebElement kuponBtn=driver.findElement(By.id("com.otelz.mobil.reservationSteps:id/viewCouponBackground"));
        kuponBtn.click();
        Thread.sleep(3000);
        WebElement kuponTextBox=driver.findElement(By.id("com.otelz.mobil.reservationSteps:id/etCouponCode"));
        kuponTextBox.sendKeys("PSD483");
        Thread.sleep(3000);
        WebElement messageBox=driver.findElement(By.id("android:id/message"));
        String message = messageBox.getText();
        assertTrue(message.contains("Great news!"));
    }
}

