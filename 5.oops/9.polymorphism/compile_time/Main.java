class MathUtils {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathUtils math = new MathUtils();

        System.out.println(math.add(5, 10));           // Calls add(int, int)
        System.out.println(math.add(5, 10, 15));       // Calls add(int, int, int)
        System.out.println(math.add(2.5, 3.5));        // Calls add(double, double)
    }
}
