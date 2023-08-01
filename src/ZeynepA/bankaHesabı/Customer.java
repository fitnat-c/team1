package ZeynepA.bankaHesabı;

public class Customer extends Account{
    private String customerName;
    private int customerNumber;

    public Customer(int hesapNumarasi, int bakiye) {
        super(hesapNumarasi, bakiye);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
}
