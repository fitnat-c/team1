package ahmetCakir.task_26.task02;

public class Account {
    //fields
    private String accountNumber;
    private  double balance;

    public void deposit(double depositMoney) {
        balance+=depositMoney;
        System.out.println(depositMoney+" TL hesabınıza yatırıldı"+"\n yeni hesabınız "+ balance+" TL olmuştur");
    }

    public void withdraw(double withdrawMoney ){
        if (withdrawMoney<balance ){
            if (withdrawMoney<5000){
                balance-=withdrawMoney;
                System.out.println("Hesabınızdan "+withdrawMoney+" TL çekilmiştir" +
                        "\nYeni bakiyeniz "+balance+" TL dir");
            }else System.out.println("Para çekme limitiniz 5000 TL dir");
        }else System.out.println("Hesabınızda yeterli bakiye bulunmamaktadır");

    }

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account() {
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
