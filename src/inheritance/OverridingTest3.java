package inheritance;

public class OverridingTest3 {
    public static void main(String[] args){
        int price =10000;

        Customer customerLee = new Customer(100010,"이순신");
        System.out.println(customerLee.getCustomerName() + " 님이 지불해야하는 금액은 " +
                customerLee.calcPrice(price) + "원입니다.");

        Customer customerKim = new VIPCustomer(100011,"김유신", 123123);
        System.out.println(customerKim.getCustomerName() + " 님이 지불해야하는 금액은 " +
                customerKim.calcPrice(price) + "원입니다.");

        Customer vc = new VIPCustomer(1000123,"나몰라", 1231231);
        System.out.println(vc.getCustomerName() + " 님이 지불해야하는 금액은 " +
                vc.calcPrice(price) + "원입니다.");
    }
}
