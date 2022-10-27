package programmingchallenge11_3;

public class NegativeValue extends Exception {
    public NegativeValue(int a) {
        super("Error: Negative units: " + a);
    }
}
