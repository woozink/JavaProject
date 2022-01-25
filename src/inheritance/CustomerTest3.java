package inheritance;

import java.util.ArrayList;

public class CustomerTest3 {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer customerLee = new Customer(10010, "이순신");
        Customer customerShin = new Customer(1014010, "신사임당");
        Customer customerHong = new Customer(12310, "홍길동");
        Customer customerYoul = new Customer(101230, "이율곡");
        Customer customerKim = new VIPCustomer(10050, "김유신", 11231);

        customerList.add(customerLee);
        customerList.add(customerHong);
        customerList.add(customerShin);
        customerList.add(customerYoul);
        customerList.add(customerKim);

        System.out.println(" ==== 고객 정보 출력 =====");
        int price = 10000;

        for (Customer customer : customerList) {
            int cost = customer.calcPrice(price);
            System.out.println(customerHong.getCustomerName() + " 님이 "
                    + cost + "원 지불하였습니다.");
            System.out.println(customerKim.getCustomerName() + " 님의 현재 보너스 포인트는 "
                    + customer.bonusPoint + " 점 입니다.");
        }

    }
}
