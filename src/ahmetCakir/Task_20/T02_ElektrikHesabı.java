package ahmetCakir.Task_20;

public class T02_ElektrikHesabı {

    // fields
    int toplamTuketim;
    double oran;
    double fatura;

    public T02_ElektrikHesabı() {
    }

    @Override
    public String toString() {
        return "T02_ElektrikHesabı{" +
                "toplamTuketim=" + toplamTuketim +
                ", oran=" + oran +
                ", fatura=" + fatura +
                '}';
    }
     public static double odenecekTutar(double tuketim){
        double odenecek=tuketim*0.7;
        return odenecek;
     }
}
