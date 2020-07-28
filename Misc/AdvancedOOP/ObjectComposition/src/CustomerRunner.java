package Misc.AdvancedOOP.ObjectComposition.src;

public class CustomerRunner {
    public static void main(String[] args) {
        
        Address homeAddress = new Address("Urca", "Rio de Janeiro", "33333-333");
        Customer customer = new Customer("Customer1", homeAddress);
        Address workAddress = new Address("Copacabana", "Rio de Janeiro", "99999-999");
        customer.setWorkAddress(workAddress);

        System.out.println(customer);
    }
}