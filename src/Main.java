
public class Main {
    public static void main(String[] args) {
        System.out.println("Implementation of Abstract factory design pattern");

        Customer customer = new Customer("A", true);
        Factory factory = getCarFactory(customer);
        Car car = factory.create(customer.getGradeRequest());
        car.startEngine();
    }

    private static Factory getCarFactory(Customer customer) {
        if(customer.hasCompanyContract()) {
            return new CompanyCarFactory();
        } else {
            return new CarFactory();
        }
    }
}