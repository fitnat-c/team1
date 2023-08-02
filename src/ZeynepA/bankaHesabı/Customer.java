package ZeynepA.bankaHesabı;

public class Customer {
    private String customerName;
    private static int tempCustomerNumber = 12345;
    private int customerNumber;

    public Customer() {
    }

    public Customer(String customerName) {
        this.customerName = customerName;
        this.customerNumber= tempCustomerNumber;
        tempCustomerNumber++;
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

}
