
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ProductManager {
    ProductManager(){

    }

    private List<Product> productList = new ArrayList<>();


    public List<Product> getProductList() {
        return productList;
    }


    public void addProduct(Product product) {

        productList.add(product);
    }

    public List<Product> findGoods(String name) {

        List<Product> resultProduct = new LinkedList<>();
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                resultProduct.add(product);
            }
        }
        return resultProduct;
    }


    public List<Product> sortByWeight(List<Product> products) {
        products.sort(Comparator.comparing(Product::getWeight));
        return products;
    }


}
