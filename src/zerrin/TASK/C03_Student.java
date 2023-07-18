package zerrin.TASK;

public class C03_Student {
    String name;
    String lastname;
    int classno;
    double degree;
    int scollno;
    boolean success;
    public void graduate() {
        if (degree >= 60) {

            System.out.println("mezunsun");
        }else System.out.println("mezun degilsun");
    }
    public void socialActivita() {
        System.out.println("sosyal aktivitelere katilmalisin");
    }

    @Override
    public String toString() {
        return "C03_Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", classno=" + classno +
                ", degree=" + degree +
                ", scollno=" + scollno +
                ", success=" + success +
                '}';
    }
}
