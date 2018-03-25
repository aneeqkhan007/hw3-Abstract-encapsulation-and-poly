package Abstract;

public class Sony  implements Tv{

    @Override
    public void on() {
        System.out.println("Sony-- On ");

    }

    @Override
    public void off() {
        System.out.println("Sony-- Off ");

    }

    @Override
    public void wired() {
        System.out.println("Sony-- Wired ");

    }

    public void setting() {
        System.out.println("Sony-- settings matters");
    }



}
