package homepage;

import common.CommonAPI;
import org.junit.Test;

public class login extends CommonAPI {
    @Test
    public void logintest(){
        clickByXpath("//a[@id='headerMyAccount']");
        clickByXpath("//span[contains(text(),'Sign in')]");
        typeByXpath("//input[@id='email']","cbinitish@gmail.com");
        typeByXpath("//input[@id='password-input-field']","Nitish1!");
        clickByXpath("//span[contains(text(),'Sign In')]");
    }

}