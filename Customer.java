package shopping;

import java.util.Arrays;

public abstract class Customer extends Person implements Discountable {

private Product[] products;
private Size size;

    public Customer(String name, Product[] products,Size size) {
        super(name);
        this.products = products;
        this.size = size;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
