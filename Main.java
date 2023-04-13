package shopping;

public class Main {


    public static void main(String[] args) {

        Product product1 = new Product("shirt", 20, Size.MEDIUM);
        Product product2 = new Product("pants", 30, Size.LARGE);
        Product[] products = {product1, product2};

        Customer customer = new Student("Alice", products, Size.MEDIUM, 123456);
        Business business = new Business(product1, "address");


        System.out.println(ShopApp.calculateTotal(products));

        System.out.println(ShopApp.isAFit(customer, product1));

        Discountable[] discountables = {customer, business};
        ShopApp.printEveryDiscountAvailableForAProduct(discountables, product1);
    }



    }

