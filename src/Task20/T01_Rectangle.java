package Task20;

public class T01_Rectangle {

    double width ;
    double length;

    void cevre(double width, double length) {
        System.out.println("cevre: " + (2 * (width + length)));
    }

    void alan(double width, double length) {
        System.out.println("alan : " + (width * length));
    }

    public T01_Rectangle(double width, double length) {
        this.width = width;
        this.length = length;

    }
}
