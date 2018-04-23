import java.net.CookieStore;
import java.util.List;

import static java.lang.System.out;

public class Main {

    public Main() {
    }

    public static void main(String... args) {

        ProductManager pm = new ProductManager();
        pm.addProduct(new Bread(11,"Puskina",  "Bread", true, 122));
        List result = pm.findGoods("Bread");
        result.forEach(x -> System.out.println(x));
        result = pm.sortByWeight(pm.getProductList());
    }


}
