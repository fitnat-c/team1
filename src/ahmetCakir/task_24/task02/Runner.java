package ahmetCakir.task_24.task02;

import java.util.Scanner;

import static TasksSolutions.task24.task02.RentApartments.rentPrice;

public class Runner {
    public static void main(String[] args) {
        RentApartments rentApartments=new RentApartments();
        System.out.println("Please enter your name");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        rentApartments.setName(name);
        System.out.println("Welcome to our hotel.Which room do you want? please select number of room \n 0/1/2/3");
        int roomCount=input.nextInt();
        rentApartments.setRoomCount(roomCount);
        rentApartments.roomNum(roomCount);
        System.out.println("Do you wanna have balcony \n 'Yes' or 'no' ");
        String choise=input.next();
        rentApartments.balconyOrNo(choise);
        System.out.println(rentApartments.getName()+" rent is "+rentPrice);

    }
}
