import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {
    @Test
    public void cartSize() {
        ShoppingCart size = new ShoppingCart();
        Assert.assertEquals(6, size.cartLength());
    }

    public void cartAddSize() {
        ShoppingCart size = new ShoppingCart();
        Assert.assertEquals(size.cartLength() + 1, size.cartAdd(8).length);
    }
}