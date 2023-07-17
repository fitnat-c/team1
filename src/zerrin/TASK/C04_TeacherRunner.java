package zerrin.TASK;

public class C04_TeacherRunner {

    public static void main(String[] args) {
        C04_Teacher tch=new C04_Teacher("zerrin","izgu","muzik");

        C04_Teacher ogrt=new C04_Teacher();
        ogrt.name="nur";
    ogrt.lastName="dal";
    ogrt.id=12345;
    ogrt.branch="matematik";
    ogrt.emekliMi=false;
    ogrt.maas=20000;
    ogrt.tecrube=22;
    ogrt.yas=45;
        System.out.println("ogrt = " + ogrt);
        C04_Teacher ogrtFullPmli=new C04_Teacher(34,"izgub","mehmet","turkce",23,46,18000,false);
        System.out.println("ogrtFullPmli = " + ogrtFullPmli);
    }
}
