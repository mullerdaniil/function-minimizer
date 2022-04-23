package minimizer.algorithms;

import minimizer.Function;

public interface Algorithm {
    double findMinimum(double a, double b, double eps, Function function);
}
