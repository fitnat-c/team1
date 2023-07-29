package ahmetCakir.task_24.task01;

public class Subscribe {
    //pojo class

    private String name;
    private boolean doYouWannaSubscribe;
    String whichMember;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDoYouWannaSubscribe() {
        return doYouWannaSubscribe;
    }

    public void setDoYouWannaSubscribe(boolean doYouWannaSubscribe) {
        this.doYouWannaSubscribe = doYouWannaSubscribe;
    }

    public String getWhichMember() {
        return whichMember;
    }

    public void setWhichMember(String whichMember) {
        this.whichMember = whichMember;
    }

    @Override
    public String toString() {
        return "Subscribe{" +
                "name='" + name + '\'' +
                ", doYouWannaSubscribe=" + doYouWannaSubscribe +
                ", whichMember='" + whichMember + '\'' +
                '}';
    }
}
