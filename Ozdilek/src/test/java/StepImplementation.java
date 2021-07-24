
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;



public class StepImplementation extends BaseTest{
    @Step("Alışverişe başla butonuna tıkla")
    public void clickTicketButton() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement el1 = (MobileElement) driver.findElementById("com.ozdilek.ozdilekteyim:id/tv_startShoppingStore");
        el1.click();
    }

    @Step("Kategoriler sayfasını aç")
    public void clickOneWayButton() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Kategoriler\"]/android.widget.ImageView");
        el1.click();

    }

    @Step("Menüden kadın seçeneğine tıkla pantolon kategorisini aç")
    public void saw() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Kategoriler\"]/android.widget.ImageView");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.TextView");
        el3.click();
    }

    @Step("En son ürünü favoriye ekle")
    public void esb() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[6]/android.view.ViewGroup/android.widget.ImageView[2]");
        el1.click();
    }

    @Step("Geri butonuna tıkla")
    public void selectDate() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement el1 = (MobileElement) driver.findElementById("com.ozdilek.ozdilekteyim:id/ivBack");
        el1.click();
    }

    @Step("Hesabım butonuna tıkla")
    public void passengerInformation() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement el6 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Hesabım\"]/android.widget.ImageView");
        el6.click();
    }

    @Step("Geri butonuna tıkla")
    public void clickBookAFlightButton() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement el1 = (MobileElement) driver.findElementById("com.ozdilek.ozdilekteyim:id/ivBack");
        el1.click();
    }

    @Step("Sepetim butonuna tıkla")
    public void editFilters() throws InterruptedException {
        Thread.sleep(2000);
        MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Sepetim\"]/android.widget.ImageView");
        el1.click();
    }

}
