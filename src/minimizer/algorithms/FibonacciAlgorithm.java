package minimizer.algorithms;

import minimizer.Function;
import minimizer.ValuesCounter;

public class FibonacciAlgorithm implements Algorithm {
    private static final int MAX_FIB = 500;
    private static final double[] FIB = new double[MAX_FIB];

    static {
        FIB[1] = FIB[0] = 1;
        for (int i = 2; i < MAX_FIB; i++) {
            FIB[i] = FIB[i - 1] + FIB[i - 2];
        }
    }

    @Override
    public double findMinimum(double a, double b, double eps, Function function) {
        ValuesCounter counter = new ValuesCounter("Fibonacci");

        int n = 3;
        while (FIB[n] <= (b - a) / eps) {
            n++;
        }

        double x1 = a + (b - a) * FIB[n - 2] / FIB[n];
        double x2 = a + (b - a) * FIB[n - 1] / FIB[n];
        double y1 = function.evaluate(x1);
        double y2 = function.evaluate(x2);

        counter.addFunctionEvaluation();
        counter.addFunctionEvaluation();
        counter.addIteration();

        while (n > 1) {
            counter.addIteration();
            counter.addIntervalSize(b - a);

            x1 = a + (b - a) * FIB[n - 2] / FIB[n];
            x2 = a + (b - a) * FIB[n - 1] / FIB[n];

            if (y1 > y2) {
                a = x1;
                x1 = x2;
                x2 = b - (x1 - a);
                y1 = y2;
                y2 = function.evaluate(x2);
            } else {
                b = x2;
                x2 = x1;
                x1 = a + (b - x2);
                y2 = y1;
                y1 = function.evaluate(x1);
            }

            counter.addFunctionEvaluation();

            n--;
        }

        double result = x1 + (x2 - x1) / 2;
        counter.print(result);
        return result;
    }
}
