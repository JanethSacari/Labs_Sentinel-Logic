public class ExceptionCombat {
    public static void main(String[] args) {
        System.out.println("--- Starting Logic Combat Test ---");
        try {
            int result = 10 / 0; // Causes ArithmeticException
        } catch (ArithmeticException e) {
            // In Java 8, there is tricks!
            System.out.println("[CATCH] Captured a math error: " + e.getMessage());
        } finally {
            // The `finally` block ALWAYS executes (just like clearing the dojo).
            System.out.println("[FINALLY] Cleaning up resources. Dojo is clean.");
        }
        System.out.println("--- End of Combat ---");
    }
}