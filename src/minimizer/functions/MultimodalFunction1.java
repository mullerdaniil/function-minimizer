package minimizer.functions;

import minimizer.functions.Function;

public class MultimodalFunction1 implements Function {
    @Override
    public double evaluate(double x) {
        return - x * x - x * x * x + Math.pow(x, 4) + Math.pow(x, 5);
    }
}
