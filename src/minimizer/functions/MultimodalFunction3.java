package minimizer.functions;

/**
 * A sample function
 */
public class MultimodalFunction3 implements Function {
    /**
     * {@inheritDoc}
     */
    @Override
    public double evaluate(double x) {
        return Math.sin(Math.sin(Math.sin(Math.sin(x))));
    }
}