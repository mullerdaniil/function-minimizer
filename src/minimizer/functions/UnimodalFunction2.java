package minimizer.functions;

/**
 * A sample function
 */
public class UnimodalFunction2 implements Function {
    /**
     * {@inheritDoc}
     */
    @Override
    public double evaluate(double x) {
        return Math.abs(x - 2) - 2;
    }
}