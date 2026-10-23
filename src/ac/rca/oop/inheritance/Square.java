package ac.rca.oop.inheritance;

public class Square extends Shape {
    private int side;

    // Corrected constructor names to match class capitalization
    public Square() {}

    public Square(int side) {
        this.side = side;
    }

    // Moved inside the class body
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    // Corrected @Override annotation syntax
    @Override
    public double area() {
        return side * side;
    }
} // Properly placed closing brace for the class
