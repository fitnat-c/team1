package ahmetCakir.task_24.task01;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        Subscribe subscribe=new Subscribe();
        System.out.println("******* Welcome to Our WebSite ********"+"\n Do u wanna subscribe our WebPage?\n 'Yes' or 'No'");
        String secim=input.next().toLowerCase();
        if (secim.equalsIgnoreCase("yes")){
            subscribe.setDoYouWannaSubscribe(true);

            System.out.println("isminizi giriniz");
            input.nextLine();
            subscribe.setName(input.nextLine());

            System.out.println("Üyelik türünü giriniz.\n Gold/silver/bronze");
            String uyelikTuru=input.next();
            if (uyelikTuru.equalsIgnoreCase("gold")){
                subscribe.setWhichMember(uyelikTuru);
                System.out.println("Welcome to membership "+subscribe.getName()+" Your membership is 40 dollar for month you can enjoy the videos ,\n" +
                        "    all homework and see you soon.");
            } else if (uyelikTuru.equalsIgnoreCase("silver")) {
                subscribe.setWhichMember(uyelikTuru);
                System.out.println("Welcome to membership "+ subscribe.getName()+" Your membership is 20 dollar for month you can enjoy the videos and all homework");
            } else if (uyelikTuru.equalsIgnoreCase("bronze")) {
                subscribe.setWhichMember(uyelikTuru);
                System.out.println("Welcome to membership "+ subscribe.getName()+" Your membership is 10 dollar for month you can enjoy the videos.");
            }else {
                System.out.println("Please enter available membership");
            }
            System.out.println("subscribe = " + subscribe);
        }else {
            System.out.println("See you when you want to be a member. Thanks ");
        }
    }
}
