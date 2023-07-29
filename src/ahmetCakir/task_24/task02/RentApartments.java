package ahmetCakir.task_24.task02;

import java.util.Scanner;

public class RentApartments {
    //pojo class

    private String name;
    private int roomCount;
    private boolean balconyOrNo;
    static double rentPrice=0;
    static Scanner input=new Scanner(System.in);

    public double roomNum(int number){
        switch (number){
            case 0:
             rentPrice+=1400;
                break;
            case 1:
               rentPrice+=1700;
                break;
            case 2:
               rentPrice+=2200;
                break;
            case 3:
                rentPrice+=2700;
                break;
            default:
                System.out.println("Please enter avaliable choise");
                break;
        }
        return rentPrice;
    }
    public double balconyOrNo(String str){
        if (str.equalsIgnoreCase("yes")){
           setBalconyOrNo(true);
            rentPrice+=200;
        }else setBalconyOrNo(false);
        return rentPrice;
    }

    public RentApartments() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    @Override
    public String toString() {
        return "rentApartments{" +
                "name='" + name + '\'' +
                ", roomCount=" + roomCount +
                ", balconyOrNo=" + balconyOrNo +
                '}';
    }

    public boolean isBalconyOrNo() {
        return balconyOrNo;
    }

    public void setBalconyOrNo(boolean balconyOrNo) {
        this.balconyOrNo = balconyOrNo;
    }

}
