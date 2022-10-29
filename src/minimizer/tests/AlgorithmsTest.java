package minimizer.tests;

import minimizer.Minimizer;
import minimizer.algorithms.*;
import minimizer.functions.Function;
import minimizer.functions.UnimodalFunction1;
import minimizer.functions.UnimodalFunction2;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgorithmsTest {
    private static final double EPS = 0.001;

    private final List<Algorithm> algorithms = Arrays.asList(
            new BrentAlgorithm(),
            new DichotomyAlgorithm(),
            new FibonacciAlgorithm(),
            new GoldenSectionSearchAlgorithm()
    );

    @Test
    public void testOnUnimodalFunction1() {
        testOnUnimodalFunction(new UnimodalFunction1(), -1.0, 0.5, -1.0);
    }

    @Test
    public void testOnUnimodalFunction2() {
        testOnUnimodalFunction(new UnimodalFunction2(), -6.0, 3.0, 2.0);
    }

    private void testOnUnimodalFunction(Function function, double a, double b, double expectedValue) {
        Minimizer minimizer = new Minimizer(a, b, EPS, function);
        for (Algorithm algorithm : algorithms) {
            double actualValue = minimizer.findMinimum(algorithm);
            assertEquals(expectedValue, actualValue, EPS);
        }
    }
}
