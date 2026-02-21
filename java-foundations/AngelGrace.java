class Angel {
    String name;
    String lineage;

    // Default constructor (important for the exam!)
    Angel() { 
        this.name = "Generic Angel"; 
        this.lineage = "Heaven"; 
    }

    // Overloaded constructor (the choice)
    Angel(String name, String lineage) {
        this.name = name;
        this.lineage = lineage;
    }

    void mission() {
        System.out.println(name + " is following orders from " + lineage);
    }
}

class Castiel extends Angel {
    Castiel() {
        // Calling the overloaded constructor: choosing a different lineage
        super("Castiel", "Chosen Family (The Winchesters)");
    }

    @Override
    void mission() {
        System.out.println(name + " is protecting his chosen family. 'I'm the one who gripped you tight and raised you from perdition.'");
    }
}

public class AngelGrace {
    public static void main(String[] args) {
        // Polymorphism in action
        Angel specialAngel = new Castiel(); 
        specialAngel.mission(); // Output will be the overridden version
        
        // Ternary check for the "Fixed Gaze"
        boolean isResilient = true;
        String status = isResilient ? "Found a home" : "Still searching";
        System.out.println("Status: " + status);
    }
}