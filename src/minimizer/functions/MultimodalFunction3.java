package minimizer.functions;

public class MultimodalFunction3 implements Function {

    @Override
    public double evaluate(double x) {
        return Math.sin(Math.sin(Math.sin(Math.sin(x))));
    }
}
