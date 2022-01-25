package inheritance;

public class VIPCustomer extends Customer {
    private int agentID; // VIP 고객 상담원 아이디
    double saleRatio; // 할인율

    public VIPCustomer(int customerId, String customerName, int agentID) {
        super(customerId, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
        System.out.println("VIPCustomer(int, String, int 생성자 호출)");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio); // 할인된 가격을 계산하여 변환
    }

    public int getAgentID() {
        return agentID;
    }
}
