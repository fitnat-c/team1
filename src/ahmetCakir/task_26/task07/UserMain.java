package ahmetCakir.task_26.task07;


import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<User> userList=new ArrayList<>();
        char secim='a';
        while (secim!='H'){
            System.out.println("Lütfen user name giriniz");
            input.nextLine();
            String userName=input.nextLine();
            System.out.println("Lütfen password giriniz");
            String password=input.nextLine();
        User userInfo=new User(userName,password);
            try {
                if (password.length()>=6){
                    userList.add(userInfo);
                    System.out.println(userInfo.getUserName()+"Sisteme kaydoldunuz");
                }else throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
               e.printStackTrace();
                System.out.println("Parola 6 dan küçük girilemez");
                continue;
            }
            System.out.println("Ekleme işlemlerini bitirmek isterseniz 'H' a basınız");
           secim=input.next().toUpperCase().charAt(0);
        }

        for (User usr:userList) {
            System.out.println("usr.toString() = " + usr.toString());
        }

    }

}
