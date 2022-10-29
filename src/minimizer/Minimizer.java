package minimizer;

import minimizer.algorithms.Algorithm;
import minimizer.functions.Function;

/**
 * Minimizer represents a class that is constructed from fixed parameters
 * (interval [{@code a}, {@code b}], accuracy (error) {@code eps}, function {@code function})
 * and finds a function minimum using a given minimization algorithm.
 */
public class Minimizer {
    /**
     * the left border of the interval
     */
    private final double a;

    /**
     * the right border of the interval
     */
    private final double b;

    /**
     * the accuracy (error)
     */
    private final double eps;

    /**
     * the function to find minimum
     */
    private final Function function;

    /**
     * Initialize a new instance of Minimizer using fixed parameters
     * @param   a the left border of the interval
     * @param   b the right border of the interval
     * @param   eps the accuracy (error)
     * @param   function the function to find minimum
     */
    public Minimizer(double a, double b, double eps, Function function) {
        this.a = a;
        this.b = b;
        this.eps = eps;
        this.function = function;
    }

    /**
     * Find a minimum point using a given algorithm
     * @param   algorithm minimization algorithm
     * @return  the minimum point where the function has the minimum value
     */
    public double findMinimum(Algorithm algorithm) {
        return algorithm.findMinimum(a, b, eps, function);
    }
}