package shopping;

public abstract class Employee extends Customer {
    private final double DISCOUNT = 0.10;


    public Employee(String name, Product[] products, Size size) {
        super(name, products, size);
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }

    public abstract void printEmployeePriceAfterDiscount(Product product);
    public abstract void printEmployeePriceAfterDiscount(Product[] product);
}
