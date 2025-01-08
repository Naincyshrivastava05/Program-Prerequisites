import java.util.Scanner;

class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the base
        System.out.print("Enter the base: ");
        double base = sc.nextDouble();

        // Input the exponent
        System.out.print("Enter the exponent: ");
        double exponent = sc.nextDouble();

        // Calculate the power using Math.pow
        double result = Math.pow(base, exponent);

        // Print the result
        System.out.println("Result: " + result);
    }
}
