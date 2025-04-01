public class AdvancedCalculator extends IntCalculator {

    public AdvancedCalculator(int initialState) {
        super(initialState);
    }

    public AdvancedCalculator divide(int value) {
        if (value != 0) {
            this.state /= value;
        }
        return this;
    }

    public AdvancedCalculator power(int exponent) {
        this.state = (int) Math.pow(this.state, exponent);
        return this;
    }

    public AdvancedCalculator root(int n) {
        this.state = (int) Math.pow(this.state, 1.0 / n);
        return this;
    }

    public static void main(String[] args) {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator(10);
        int result = advancedCalculator.divide(2).power(4).root(2).result();
        System.out.println("b) " + result);
    }
}