package minimizer.algorithms;

import minimizer.functions.Function;
import minimizer.ValuesCounter;

/**
 * The implementation of {@code Algorithm} interface that uses Brent algorithm to find the minimum.
 */
public class BrentAlgorithm implements Algorithm {

    /**
     * Phi constant
     */
    private static final double PHI = (3 - Math.sqrt(5)) / 2;

    /**
     * {@inheritDoc}
     */
    @Override
    public double findMinimum(double a, double b, double eps, Function function) {
        ValuesCounter counter = new ValuesCounter("Brent");

        double x;
        double cur;
        double prev = x = cur = a + (b - a) / 2;

        double fX;
        double fCur;
        double fPrev = fX = fCur = function.evaluate(x);

        double lenCur;
        double lenPrev = lenCur = b - a;

        counter.addIteration();
        counter.addFunctionEvaluation();

        double u;
        double g;
        double fU;
        while (b - a >= eps) {
            counter.addIteration();
            counter.addIntervalSize(b - a);

            g = lenPrev;
            lenPrev = lenCur;
            u = cur - ( (cur - x) * (cur - x) * (fCur - fPrev) - (cur - prev) * (cur - prev) * (fCur - fX) ) /
                    ( 2 * ( (cur - x) * (fCur - fPrev) - (cur - prev) * (fCur - fX) ) );

            if (a + eps <= u && u <= b - eps && Math.abs(u - x) < g / 2) {
                lenCur = Math.abs(u - x);
            } else {
                if (x < a + (b - a) / 2) {
                    lenCur = b - x;
                    u = x + (b - x) * PHI;
                } else {
                    lenCur = x - a;
                    u = x - (x - a) * PHI;
                }
            }

            fU = function.evaluate(u);
            counter.addFunctionEvaluation();

            if (fU > fX) {
                if (u < x) {
                    a = u;
                } else {
                    b = u;
                }

                if (fU <= fCur || cur == x) {
                    prev = cur;
                    cur = u;
                    fPrev = fCur;
                    fCur = fU;
                } else if (fU <= fPrev || x == prev || cur == prev) {
                    prev = u;
                    fPrev = fU;
                }
            } else {
                if (u < x) {
                    b = x;
                } else {
                    a = x;
                }

                prev = cur;
                cur = x;
                x = u;
                fPrev = fU;
                fCur = fX;
                fX = fU;
            }

            if (Math.max(x - a, b - x) < eps)
                break;
        }

        double result = x;
        counter.print(result);
        return result;
    }
}