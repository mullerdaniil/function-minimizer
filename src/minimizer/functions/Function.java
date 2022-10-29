package minimizer.functions;

/**
 * Function that takes one argument and returns the value
 */
public interface Function {
    /**
     * Evaluate the function value for a given argument
     * @param   argument the argument passed to the function
     * @return  the function value
     */
    double evaluate(double argument);
}
