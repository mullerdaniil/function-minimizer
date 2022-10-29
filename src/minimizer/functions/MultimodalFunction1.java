package minimizer.functions;

/**
 * A sample function
 */
public class MultimodalFunction1 implements Function {
    /**
     * {@inheritDoc}
     */
    @Override
    public double evaluate(double x) {
        return - x * x - x * x * x + Math.pow(x, 4) + Math.pow(x, 5);
    }
}
