package shopping;

public class Business implements Discountable{

private String address;
private Product product;
    private Product[] products;
private final double DISCOUNT = .25;

    public Business(Product product,String address) {
        this.address = address;
        this.product = product;
    }
    public Business(Product[] product,String address) {
        this.address = address;
        this.products = product;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }

    @Override
    public double calculateDiscount(Product product) {
        return product.getPrice() * DISCOUNT ;
    }
    @Override
    public double calculateDiscount(Product[] products) {
        double sum = 0;

        for (int i = 0; i < products.length; i++) {

            sum += products[i].getPrice();
        }

        return sum * DISCOUNT;
    }
}
