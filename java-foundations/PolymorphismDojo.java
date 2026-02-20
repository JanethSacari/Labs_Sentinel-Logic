interface Fighter { void strike(); }

abstract class MartialArtist {
    String name;
    // Constructor Overloading
    MartialArtist() { this.name = "Unknown"; }
    MartialArtist(String name) { this.name = name; }
}

class Karateka extends MartialArtist implements Fighter {
    Karateka(String name) { super(name); }
    
    @Override
    public void strike() { System.out.println(name + " uses Seiken Tsuki!"); }
}

public class PolymorphismDojo {
    public static void main(String[] args) {
        // Object Type vs Reference Type
        MartialArtist artist = new Karateka("Iris"); 
        // artist.strike(); // COMPILE ERROR! MartialArtist does not have strike()
        
        ((Karateka)artist).strike(); // Casting required to access the Karateka method.

        // Multi-dimensional Array (Pay attention to the syntax!)
        int[][] dojoGrid = new int[2][]; 
        dojoGrid[0] = new int[]{1, 2, 3};
        dojoGrid[1] = new int[]{4, 5};
        System.out.println("Grid size row 1: " + dojoGrid[0].length);
    }
}