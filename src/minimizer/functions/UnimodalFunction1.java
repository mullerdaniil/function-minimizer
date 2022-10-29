package minimizer.functions;

public class UnimodalFunction1 implements Function {

    @Override
    public double evaluate(double x) {
        return -3 * Math.pow(x, 4) + 2;
    }
}
