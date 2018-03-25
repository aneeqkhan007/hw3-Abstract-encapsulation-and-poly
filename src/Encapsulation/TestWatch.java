package Encapsulation;

public class TestWatch {

    public static void main(String[] args) {
        Watch watch = new Watch();
        watch.setStraps(2);
        watch.setNames("Gucci");
        watch.setGems(3);
        System.out.println(watch.getNames() + " can have " +watch.getStraps()+"  number of changeable bands with "+watch.getGems()+" diamonds studs");
    }
}
