package shopping;

public class ShopApp {
    public static void printPersonName(Person person) {
        System.out.println(person.getName());
    }

    public static double calculateTotal(Product[] products) {
        double sum = 0;


        for (int i = 0; i < products.length; i++) {

            sum += products[i].getPrice();
        }

        return sum;
    }

    public static boolean isAFit(Customer customer, Product product) {
        return customer.getSize() == product.getSize();
    }

    public static void printEveryDiscountAvailableForAProduct(Discountable[] discounted, Product product) {
        for (int i = 0; i < discounted.length; i++) {
            Discountable discountable = discounted[i];
            double discount = discountable.calculateDiscount(product);
            System.out.println("Discount: " + discount + " Price after discount: " + (product.getPrice() - discount));
        }
    }



}
