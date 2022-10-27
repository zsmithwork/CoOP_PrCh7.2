package programmingchallenge11_3;

public class NegativePrice extends Exception {
    public NegativePrice(double a) {
        super("Error: Negative price: " + a);
    }
}
