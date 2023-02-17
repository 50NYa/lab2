public class Main {
    public static void main(String[] args) {
        Calculator calculator_first = new Calculator(5, 0.1, 0.05, 100);
        calculator_first.set(182.5, 18.225, -0.03298);
        calculator_first.calculate();
        calculator_first.print();
    }
}