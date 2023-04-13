package shopping;

public class Manager extends Employee {

    private final double DISCOUNT = 0.05;

    public Manager(String name, Product[] products, Size size) {
        super(name, products, size);
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

    @Override
    public void printEmployeePriceAfterDiscount(Product product) {
       double sum = product.getPrice() * DISCOUNT;
double answer = product.getPrice() - sum;
        System.out.println("The price is" + answer + "" );

    }

    @Override
    public void printEmployeePriceAfterDiscount(Product[] product) {
        double sum = 0;

        for (int i = 0; i < product.length; i++) {

            sum += product[i].getPrice();
        }

        double price =   sum * DISCOUNT;
     double answer = sum - price;


        System.out.println("the price is" + answer);
    }
}
