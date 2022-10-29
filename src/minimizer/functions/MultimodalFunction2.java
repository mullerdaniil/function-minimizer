package minimizer.functions;

/**
 * A sample function
 */
public class MultimodalFunction2 implements Function {
    /**
     * {@inheritDoc}
     */
    @Override
    public double evaluate(double x) {
        return Math.pow(x, 4) - 3 * x * x + x;
    }
}