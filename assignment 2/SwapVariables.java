package assignment;

public class SwapVariables {
    public static void main(String[] args) {
        int a = 8;
        int b = 1;
        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a + ", b = " + b);
    }
}

