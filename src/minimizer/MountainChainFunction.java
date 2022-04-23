package minimizer;

public class MountainChainFunction implements Function {
    @Override
    public double evaluate(double x) {
        return Math.sin(x) * Math.pow(x, 3);
    }
}
