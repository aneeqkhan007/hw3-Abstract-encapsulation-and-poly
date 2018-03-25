package Abstract;

public class TestMusicalInstruments {

    public static void main (String[] args) {

        Orchestra tb = new Orchestra();

        tb.flute();
        tb.Timpani();
        tb.violin();
        tb.leadFlute();

        MusicalInstruments b = new Orchestra();
        b.violin();
        b.flute();
        b.Timpani();

    }
}
