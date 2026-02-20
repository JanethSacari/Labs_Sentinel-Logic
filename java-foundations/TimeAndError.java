import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeAndError {
    public static void main(String[] args) {
        // 1. Calendar Data (Java 8 API)
        LocalDate examDate = LocalDate.of(2026, Month.FEBRUARY, 17);
        Period p = Period.ofDays(2);
        LocalDate nextExam = examDate.plus(p);
        
        System.out.println("Next Exam: " + nextExam.format(DateTimeFormatter.ISO_DATE));

        // 2. Exception Differentiation (Checked vs Unchecked vs Error)
        try {
            throw new RuntimeException("Unchecked!"); 
        } catch (RuntimeException e) {
            System.out.println("Caught Unchecked (Arithmetic, NullPointer, etc are here)");
        } catch (Exception e) {
            System.out.println("Caught Checked (IOException, SQLException)");
        }
        // Note: Errors (Like OutOfMemoryError) usually shouldn't be caught.
    }
}