package Lab3Uppg02;

/* The Java Tutorials -- Enum Types
 * https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html */

public enum Flygriktning {
    STOPPED (0), 
    NORTH   (1), 
    EAST    (2), 
    SOUTH   (3), 
    WEST    (4);

    private final int value;

    Flygriktning(int value) {
        this.value = value;
    }
    
    private int value() {
        return value;
    }

}
