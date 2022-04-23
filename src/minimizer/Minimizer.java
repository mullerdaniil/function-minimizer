package minimizer;

import minimizer.algorithms.Algorithm;

public class Minimizer {
    private double a;
    private double b;
    private double eps;
    private Function function;

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
