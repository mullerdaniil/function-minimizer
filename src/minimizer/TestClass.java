package minimizer;

import minimizer.algorithms.*;
import minimizer.functions.*;

public class TestClass {
    public static void main(String[] args) {
        //Function function = new MountainChainFunction();
        //Function function = new UnimodalFunction1();
        //Function function = new UnimodalFunction2();
        //Function function = new MultimodalFunction1();
        //Function function = new MultimodalFunction2();
        //Function function = new MultimodalFunction3();
        Function function = new MultimodalFunction4();
        Minimizer minimizer = new Minimizer(3.2, 5.9, 0.0001, function);
        //Minimizer minimizer = new Minimizer(-1, 1, 0.01, function);
        //Minimizer minimizer = new Minimizer(-2, 6, 0.01, function);
        System.out.println(minimizer.findMinimum(new DichotomyAlgorithm()));
        System.out.println(minimizer.findMinimum(new GoldenSectionSearchAlgorithm()));
        System.out.println(minimizer.findMinimum(new FibonacciAlgorithm()));
        System.out.println(minimizer.findMinimum(new ParabolaAlgorithm()));
        System.out.println(minimizer.findMinimum(new BrentAlgorithm()));
    }
}
