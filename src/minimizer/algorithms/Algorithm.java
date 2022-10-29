package minimizer.algorithms;

import minimizer.functions.Function;

/**
 * Algorithm allows to find the minimum point of a given function {@code function}
 * on the given interval [{@code a}, {@code b}] with the accuracy {@code eps}.
 */
public interface Algorithm {
    /**
     * Find a minimum of a function
     * @param   a the left border of the interval
     * @param   b the right border of the interval
     * @param   eps the accuracy (error)
     * @param   function the function to find minimum
     * @return  the minimum point where the function has the minimum value
     */
    double findMinimum(double a, double b, double eps, Function function);
}