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
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio); // 할인된 가격을 계산하여 변환
    }

    @Override
    public String showCustomerInfo(){
        return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + " 입니다.";
    }

    public int getAgentID() {
        return agentID;
    }
}
