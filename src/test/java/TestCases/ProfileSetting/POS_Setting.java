package TestCases.ProfileSetting;

import PageObjects.ProfileSetting.Pos_Setting_Obj;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class POS_Setting extends BaseClass {
    @Test()
    public void validating_POS_Setting_Form() throws InterruptedException {
        AdminLogin();
        Pos_Setting_Obj ps=new Pos_Setting_Obj(driver);
        ps.ClickOnProfileSetting();
        ps.ClickOnPosSetting();
        ps.setCategoryName(fk.name().firstName());
        ps.ClickOnSubmitButton();
        Thread.sleep(5000);
    }
}
