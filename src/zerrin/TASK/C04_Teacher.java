package zerrin.TASK;

public class C04_Teacher {

    int id;
    String name;
    String lastName;
    String branch;
    int tecrube;
    int yas;
    double maas;
    boolean emekliMi;

    public C04_Teacher () {

    }

    public C04_Teacher(String name, String lastName, String branch) {
        this.name = name;
        this.lastName = lastName;
        this.branch = branch;
    }

    public C04_Teacher(int id, String name, String lastName, String branch, int tecrube, int yas, double maas, boolean emekliMi) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.branch = branch;
        this.tecrube = tecrube;
        this.yas = yas;
        this.maas = maas;
        this.emekliMi = emekliMi;
    }

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", branch='" + branch + '\'' +
                ", tecrube=" + tecrube +
                ", yas=" + yas +
                ", maas=" + maas +
                ", emekliMi=" + emekliMi +
                '}';
    }
}
