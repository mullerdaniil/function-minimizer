package minimizer;

import java.util.ArrayList;
import java.util.List;

public class ValuesCounter {
    private final String name;
    private int iterationsCount = 0;
    private int functionEvalutionsCount = 0;
    private List<Double> intervalSizes;

    public ValuesCounter(String name) {
        intervalSizes = new ArrayList<>();
        this.name = name;
    }

    public void addIteration() {
        iterationsCount++;
    }

    public void addFunctionEvaluation() {
        functionEvalutionsCount++;
    }

    public void addIntervalSize(double value) {
        intervalSizes.add(value);
    }

    public void print(double finalAnswer) {
        System.out.println("Values (" + name + ") :");
        System.out.println("number of iterations: " + iterationsCount);
        System.out.println("number of function evaluations: " + functionEvalutionsCount);
        System.out.println("interval sizes:");
        for (double size : intervalSizes) {
            System.out.println(size);
        }
        System.out.println("answer: " + finalAnswer);
        System.out.println("\n\n");
    }
}
