package shopping;

public class Student extends Customer {
    private long studentID;
    private final double DISCOUNT = 0.05;

    public Student(String name, Product[] products, Size size,long studentID) {
        super(name, products, size);
        this.studentID = studentID;
    }

    public long getStudentID() {
        return studentID;
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
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
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", DISCOUNT=" + DISCOUNT +
                '}';
    }
}
