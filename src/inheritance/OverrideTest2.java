package inheritance;

public class OverrideTest2 {
    public static void main(String[] args) {
        Customer vc = new VIPCustomer(10030,"나몰라", 1234);
        vc.bonusPoint = 1000;

        System.out.println(vc.getCustomerName() + " 님이 지불해야하는 금액은 "
                + vc.calcPrice(10000)+ " 원 입니다.");
    }
}
