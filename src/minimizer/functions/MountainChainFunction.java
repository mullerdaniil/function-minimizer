package minimizer.functions;

/**
 * A sample function
 */
public class MountainChainFunction implements Function {
    /**
     * {@inheritDoc}
     */
    @Override
    public double evaluate(double x) {
        return Math.sin(x) * Math.pow(x, 3);
    }
}
