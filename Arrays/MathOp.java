class MathOperations {

    int calculate(int a, int b) {
        return a + b;
    }

    double calculate(double a, double b) {
        return a + b;
    }

    int calculate(int a, int b, int c) {
        return a + b + c;
    }
}
class MathOp
{
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();

        System.out.println("Sum of two integers: " + obj.calculate(10, 20));
        System.out.println("Sum of two doubles: " + obj.calculate(10.5, 20.5));
        System.out.println("Sum of three integers: " + obj.calculate(5, 10, 15));
    }
}
