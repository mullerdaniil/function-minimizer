package minimizer.algorithms;

import minimizer.functions.Function;
import minimizer.ValuesCounter;
/**
 * The implementation of {@code Algorithm} interface that uses the parabola algorithm to find the minimum.
 */
public class ParabolaAlgorithm implements Algorithm {

    /**
     * {@inheritDoc}
     */
    @Override
    public double findMinimum(double a, double b, double eps, Function function) {
        ValuesCounter counter = new ValuesCounter("Parabola");

        double x1 = a;
        double x2 = a + (b - a) / 2;
        double x3 = b;

        double f1 = function.evaluate(x1);
        double f2 = function.evaluate(x2);
        double f3 = function.evaluate(x3);

        counter.addFunctionEvaluation();
        counter.addFunctionEvaluation();
        counter.addFunctionEvaluation();
        counter.addIteration();

        double fLeft;
        double fRight;

        double cur = 3 * eps;
        double prev = eps;

        double left;
        double right;

        while (Math.abs(cur - prev) >= eps) {
            counter.addIteration();
            prev = cur;
            cur = x2 - ( (x2 - x1) * (x2 - x1) * (f2 - f3) - (x2 - x3) * (x2 - x3) * (f2 - f1) ) /
                    ( 2 * ( (x2 - x1) * (f2 - f3) - (x2 - x3) * (f2 - f1) ) );

            if (cur < x2) {
                left = cur;
                right = x2;
                fLeft = function.evaluate(cur);
                fRight = f2;
            } else {
                left = x2;
                right = cur;
                fLeft = f2;
                fRight = function.evaluate(cur);
            }

            counter.addFunctionEvaluation();
            counter.addIntervalSize(x3 - x1);

            if (fLeft < fRight) {
                x3 = right;
                f3 = fRight;
                x2 = left;
                f2 = fLeft;
            } else {
                x1 = left;
                f1 = fLeft;
                x2 = right;
                f2 = fRight;
            }
        }

        double result = cur;
        counter.print(result);
        return result;
    }
}