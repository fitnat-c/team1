package ahmetCakir.Task_20;

public class T01_Rectangular {
    // fields
    double dikdörtgenKısaKenar;
    double getDikdörtgenUzunKenar;

    @Override
    public String toString() {
        return "T01_Rectangular{" +
                "dikdörtgenKısaKenar=" + dikdörtgenKısaKenar +
                ", getDikdörtgenUzunKenar=" + getDikdörtgenUzunKenar +
                '}';
    }

    public T01_Rectangular(double dikdörtgenKısaKenar, double DikdörtgenUzunKenar) {
        this.dikdörtgenKısaKenar = dikdörtgenKısaKenar;
        this.getDikdörtgenUzunKenar = getDikdörtgenUzunKenar;
    }

    public static double alan(double kısa,double uzun){
        double alan=kısa*uzun;
        return alan;
    }
    public static double cevre(double kısa,double uzun){
        double cevre=(kısa+uzun)*2;
        return cevre;
    }
}
