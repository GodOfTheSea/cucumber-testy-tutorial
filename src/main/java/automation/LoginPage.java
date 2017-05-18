package automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by pinte on 5/18/2017.
 */
public class LoginPage  {

    @FindBy(name = "username")
    public WebElement userNameElement;
    @FindBy(id = "password")
    public WebElement passwordElement;
    @FindBy(id = "loginButton")
    public WebElement loginBtn;




}
