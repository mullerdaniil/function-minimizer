package minimizer.algorithms;

import minimizer.functions.Function;
import minimizer.ValuesCounter;
/**
 * The implementation of {@code Algorithm} interface that uses the dichotomy algorithm to find the minimum.
 */
public class DichotomyAlgorithm implements Algorithm {
    /**
     * Coefficient used to split the search interval
     */
    private static final double DELTA_COEFFICIENT = 0.4999;

    /**
     * {@inheritDoc}
     */
    @Override
    public double findMinimum(double a, double b, double eps, Function function) {
        ValuesCounter counter = new ValuesCounter("Dichotomy");

        double delta = eps * DELTA_COEFFICIENT;

        double m;
        double x1;
        double x2;

        while (b - a > eps) {
            counter.addIteration();
            counter.addIntervalSize(b - a);

            m = a + (b - a) / 2;
            x1 = m - delta;
            x2 = m + delta;

            if (function.evaluate(x1) > function.evaluate(x2)) {
                a = x1;
            } else {
                b = x2;
            }

            counter.addFunctionEvaluation();
            counter.addFunctionEvaluation();
        }

        double result =  a + (b - a) / 2;
        counter.print(result);
        return result;
    }
}