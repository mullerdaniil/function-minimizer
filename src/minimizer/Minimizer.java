package minimizer;

import minimizer.algorithms.Algorithm;
import minimizer.functions.Function;

public class Minimizer {
    private final double a;
    private final double b;
    private final double eps;
    private final Function function;

    public Minimizer(double a, double b, double eps, Function function) {
        this.a = a;
        this.b = b;
        this.eps = eps;
        this.function = function;
    }

    public double findMinimum(Algorithm algorithm) {
        return algorithm.findMinimum(a, b, eps, function);
    }
}
