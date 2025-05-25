package tests;

import base.Base;
import org.testng.annotations.Test;
import pages.Product;

public class ProductTest extends Base {

    @Test
    public void testFilterNameZtoA() {
        Product product = new Product(driver, wait);
        product.filterNameZtoA();
    }

    @Test
    public void testFilterPriceLowToHigh() {
        Product product = new Product(driver, wait);
        product.filterPriceLowToHigh();
    }
}
