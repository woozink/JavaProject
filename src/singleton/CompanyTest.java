package singleton;

public class CompanyTest {
    public static void main(String[] args) {
        Company myCompany1 = Company.getInstance();
        Company mycompany2 = Company.getInstance();
        System.out.println(myCompany1 == mycompany2);
    }
}
