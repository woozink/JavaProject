package inheritance;

public class Customer {
    //맴버변수들
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio; // 적립비율

    public Customer(){
        initCustomer();
    }

    public Customer(int customerID, String customerName){
        this.customerID =customerID;
        this.customerName = customerName;
        initCustomer();
    }

    private void initCustomer(){
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price) {// 보너스 포인트 적립, 지불 가격 계산 메서드
        bonusPoint += price * bonusRatio; // 보너스 포인트 계산
        return price;
    }

    public String showCustomerInfo() {
        return customerName + " 님의 등급은 " + customerGrade + " 이며, 보너스포인트는 " + bonusPoint + " 입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
