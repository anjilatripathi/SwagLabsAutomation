package tests;

import base.Base;
import org.testng.annotations.Test;
import pages.Cart;

public class CartTest extends Base
{
    @Test
    public void cartInfo()
    {
        Cart c = new Cart(driver,wait);
        c.addFirstProductToCart();
        c.goToCart();
        c.proceedToCheckout();
    }
}
