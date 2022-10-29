package minimizer.functions;

public class UnimodalFunction2 implements Function {

    @Override
    public double evaluate(double x) {
        return Math.abs(x - 2) - 2;
    }
}
