import base.Base;
import org.testng.annotations.Test;
import pages.Login;

public class LoginTest extends Base
{
    @Test
    public void testInvalidLogin()
    {
        Login login = new Login(driver,wait);
        login.inValidLogin("locked_out_user","secret_sauce");

    }
    @Test
    public void testValidLogin()
    {
        Login login = new Login(driver,wait);
        login.validLogin("standard_user","secret_sauce");
    }

}