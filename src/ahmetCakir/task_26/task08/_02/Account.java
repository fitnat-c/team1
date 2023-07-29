package ahmetCakir.task_26.task08._02;

public class Account {

    private  int accountNumber=(int) (Math.random()*1000000);
    private static double balance;
    private String nameSurname;

    public Account() {
    }

    public Account(String nameSurname, double balance) {
        this.nameSurname=nameSurname;
        this.balance = balance;
        this.accountNumber=accountNumber++;
    }
    public static void deposit(double money) {
        balance+=money;
        System.out.println(money+" Tl niz "+" hesabınıza eklenmiştir.\n" +
                "Yeni bakiye ="+balance);
    }
    public static void withdraw(double money){
        if (balance>money){
            if (money<5000){
                balance-=money;
                System.out.println("yeni bakiyeniz "+balance);
            }else System.out.println("5000 in üzerinde çekim yapamazsınız");
        }
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
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



