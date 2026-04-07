public class Calculator {
    public static void main(String[] args) {
        System.out.println("=== CHƯƠNG TRÌNH MÁY TÍNH ===");
        
        int a = 10;
        int b = 5;
        
       
        Addition add = new Addition();
        System.out.println("Phép cộng: " + a + " + " + b + " = " + add.calculate(a, b));

        Subtraction sub = new Subtraction();
        System.out.println("Phép trừ: " + a + " - " + b + " = " + sub.calculate(a, b));

        Multiplication mul = new Multiplication();
        System.out.println("Phép nhân: " + a + " * " + b + " = " + mul.calculate(a, b));
    }
}
