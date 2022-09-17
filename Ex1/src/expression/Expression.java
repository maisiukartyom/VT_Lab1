package expression;

public class Expression {

    public double calculate(double x, double y){
        double numerator = 1.0D + Math.pow(Math.sin(x + y), 2.0D);
        double denominator = 2.0D + Math.abs(x - 2.0D * x / (1.0D + getSqr(x)*getSqr(y)));
        return numerator / denominator + x;
    }
    private double getSqr(double v){
        return Math.pow(v,2);
    }
}
