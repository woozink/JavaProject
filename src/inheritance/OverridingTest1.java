package inheritance;

public class OverridingTest1 {
    public static void main(String[] args) {
        Customer customerLee = new Customer(1000, "이순신");
        customerLee.bonusPoint = 10000;

        VIPCustomer customerKim = new VIPCustomer(10201, "김유신",123451);
        customerKim.bonusPoint = 10000;

        int price = 10000;
        System.out.println(customerLee.getCustomerName() + " 님이 지불해야하는 금액은 "
                + customerLee.calcPrice(price)+ "원 입니다.");
        System.out.println(customerKim.getCustomerName() + " 님이 지불해야하는 금액은 "
                + customerKim.calcPrice(price)+ "원 입니다.");
    }
}
