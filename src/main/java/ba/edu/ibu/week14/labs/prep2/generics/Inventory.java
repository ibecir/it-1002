package ba.edu.ibu.week14.labs.prep2.generics;

import java.util.ArrayList;
import java.util.List;

public class Inventory<T extends Product> {
    private List<T> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void add(T product) {
        products.add(product);
    }

    public List<T> filterByName(String name) {
        List<T> result = new ArrayList<>();
        for (T product : products) {
            if (product.getName().equals(name)) {
                result.add(product);
            }
        }
        return result;
    }

    public T getByProductId(int productId) {
        for (T product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }
}
