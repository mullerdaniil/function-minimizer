package minimizer.functions;

/**
 * A sample function
 */
public class MultimodalFunction4 implements Function {
    /**
     * {@inheritDoc}
     */
    @Override
    public double evaluate(double x) {
        return Math.abs(8 * x - Math.abs(Math.pow(x, 3)));
    }
}