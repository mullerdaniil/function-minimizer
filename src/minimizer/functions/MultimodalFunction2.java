package minimizer.functions;

import minimizer.functions.Function;

public class MultimodalFunction2 implements Function {

    @Override
    public double evaluate(double x) {
        return Math.pow(x, 4) - 3 * x * x + x;
    }
}
