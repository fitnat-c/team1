package ahmetCakir.task_24.task03;

import java.util.Scanner;
/* TODO
    Book class'ı verilmiştir.
    İki tane attributes oluşturunuz.
    bookName ve authorName (String ile)
    Book class'ını kapsülleyin. (Encapsulate)
    Main class'ın içine object  oluşturun ve sonucu yazdırınız.

todo  "Book name is BOOKNAME and Author is AUTHORNAME"
 */

public class Runner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your book name");
        String bookName=input.nextLine();
        System.out.println("Please enter your author name");
        String authorName=input.nextLine();
        Book book=new Book(bookName,authorName);
        System.out.println("Book name is "+book.getBookName()+"\n Author name is "+book.getAuthorName());



    }
}
