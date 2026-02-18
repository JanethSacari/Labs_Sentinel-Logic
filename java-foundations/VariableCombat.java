public class VariableCombat {
    public static void main(String[] args) {
        // 1. Primitive Casting
        long bigNum = 100L;
        int smallNum = (int) bigNum; // Necessary casting

        // 2. String Immutability vs StringBuilder
        String s = "Kyokushin";
        s.concat(" Karate"); // The return has been discarded! 's' remains "Kyokushin"
        
        StringBuilder sb = new StringBuilder("Kyokushin");
        sb.append(" Karate"); // StringBuilder changes the original object.

        // 3. Equality Test
        String s1 = new String("Dojo");
        String s2 = new String("Dojo");
        
        System.out.println("s1 == s2: " + (s1 == s2));      // FALSE (different objects in memory)
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // TRUE (same content)

        System.out.println("String final: " + s);
        System.out.println("StringBuilder final: " + sb);
    }
}