package minimizer.functions;

public class MultimodalFunction2 implements Function {

    @Override
    public double evaluate(double x) {
        return Math.pow(x, 4) - 3 * x * x + x;
    }
}
