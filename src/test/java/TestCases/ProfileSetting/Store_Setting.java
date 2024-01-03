package TestCases.ProfileSetting;

import PageObjects.ProfileSetting.Store_Setting_Obj;
import TestCases.BaseClass;
import org.testng.annotations.Test;

import java.io.File;

public class Store_Setting extends BaseClass {
    @Test()
    public void validating_Store_Setting_Form() throws InterruptedException {
        AdminLogin();
        Store_Setting_Obj ss=new Store_Setting_Obj(driver);
        ss.ClickOnProfileSetting();
        ss.ClickOnStoreSetting();
        ss.setStoreName("ganesh Restaurant");
        ss.setUserName("Praveen");
        ss.setStoreEmail("pujaripraveen97@gmail.com");
        ss.setStoreAddress(fk.address().streetAddress());
        ss.setStoreContact("9"+fk.number().digits(9));
        File f=new File("./data/shop photo.jpg");
        String absolutepath = f.getAbsolutePath();
        ss.setStoreImage(absolutepath);
        ss.setStoreGstNumber("DCBUYD265416");
        ss.ClickOnUpdatetButton();
        Thread.sleep(5000);
    }
}
