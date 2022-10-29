package minimizer.algorithms;

import minimizer.functions.Function;
import minimizer.ValuesCounter;

public class GoldenSectionSearchAlgorithm implements Algorithm {
    private static final double PHI = (3 - Math.sqrt(5)) / 2;

    @Override
    public double findMinimum(double a, double b, double eps, Function function) {
        ValuesCounter counter = new ValuesCounter("Golden section search");

        double x1 = a + (b - a) * PHI;
        double x2 = b - (b - a) * PHI;

        double y1 = function.evaluate(x1);
        double y2 = function.evaluate(x2);
        counter.addFunctionEvaluation();
        counter.addFunctionEvaluation();
        counter.addIteration();

        while (b - a > eps) {
            counter.addIteration();
            counter.addIntervalSize(b - a);

            if (y1 > y2) {
                a = x1;
                x1 = x2;
                x2 = b - (b - a) * PHI;
                y1 = y2;
                y2 = function.evaluate(x2);
            } else {
                b = x2;
                x2 = x1;
                x1 = a + (b - a) * PHI;
                y2 = y1;
                y1 = function.evaluate(x1);
            }

            counter.addFunctionEvaluation();
        }

        double result = a + (b - a) / 2;
        counter.print(result);
        return result;
    }
}
