package minimizer;

import java.util.ArrayList;
import java.util.List;

/**
 * {@code ValuesCounter} is used to store information about an algorithm's iterations.
 * It allows to count and then print the number of iterations,
 * changes of the interval size and the number of function evaluations.
 */
public class ValuesCounter {
    /**
     * the name of the counter
     */
    private final String name;

    /**
     * the number of completed iterations
     */
    private int iterationsCount = 0;

    /**
     * the number of completed function evaluations
     */
    private int functionEvaluationsCount = 0;

    /**
     * the list of all interval sizes
     */
    private final List<Double> intervalSizes;

    /**
     * Initialize a new instance of {@code ValuesCounter},
     * where the count values are set to 0.
     * @param   name the name of the counter
     */
    public ValuesCounter(String name) {
        intervalSizes = new ArrayList<>();
        this.name = name;
    }

    /**
     * Complete an iteration
     */
    public void addIteration() {
        iterationsCount++;
    }

    /**
     * Complete a function evaluation
     */
    public void addFunctionEvaluation() {
        functionEvaluationsCount++;
    }

    /**
     * Add a new interval size
     * @param   value a new interval size value
     */
    public void addIntervalSize(double value) {
        intervalSizes.add(value);
    }

    /**
     * Print information about an algorithm's iterations:
     * the number of iterations, changes of the interval size
     * and the number of function evaluations.
     * @param   finalAnswer the final answer value to be printed
     */
    public void print(double finalAnswer) {
        System.out.println("Values (" + name + ") :");
        System.out.println("number of iterations: " + iterationsCount);
        System.out.println("number of function evaluations: " + functionEvaluationsCount);
        System.out.println("interval sizes:");
        for (double size : intervalSizes) {
            System.out.println(size);
        }
        System.out.println("answer: " + finalAnswer);
        System.out.println("\n\n");
    }
}
