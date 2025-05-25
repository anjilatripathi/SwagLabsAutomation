package tests;

import base.Base;
import org.testng.annotations.Test;
import pages.CheckOut;

public class CheckOutTest extends Base
{
    @Test
    public void check()
    {
        CheckOut check = new CheckOut(driver,wait);
        check.checkOut("Anjila","Tripathi","4356");
    }
}
