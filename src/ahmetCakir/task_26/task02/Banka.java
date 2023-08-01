package ahmetCakir.task_26.task02;

public class Banka {
    public static void main(String[] args) {
        // 1- bir Account sınıfı oluşturunuz, fieldları accountNumber ve balance (bakiye).
        // 2- bir consructor ekleyiniz.
        // 3- Account sınıfına deposit (ParaEkle) metodu ekleyiniz.
        // 4- Account sınıfına withdraw (ParaÇıkar) metodu ekleyiniz.
        // 5- withdraw de 5000 inin üzerine Günlük limiti aştınız uyarısı verelim
        // 6- main metodunda  account oluşturarak ihtimalleri deneyiniz.
        Account account = new Account("1234344", 10000);
        System.out.println("account = " + account);
        account.deposit(5000);
        account.withdraw(4000);
        account.withdraw(5000);
        account.deposit(3000);
        account.withdraw(40000);
        System.out.println("account = " + account);

    }
}
