package minimizer.functions;

/**
 * A sample function
 */
public class UnimodalFunction1 implements Function {
    /**
     * {@inheritDoc}
     */
    @Override
    public double evaluate(double x) {
        return -3 * Math.pow(x, 4) + 2;
    }
}
