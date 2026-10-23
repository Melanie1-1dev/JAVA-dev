package ac.rca.oop.inheritance;

public class BoxWeight extends Box {
    // 1. Add the new specialized property
    private double weight;

    // 2. Default Constructor
    public BoxWeight() {
        super(); // Calls Box()
        this.weight = 0.0;
    }

    // 3. Parameterized Constructor
    public BoxWeight(int height, int length, int width, double weight) {
        super(height, length, width); // Passes dimensions to the parent Box constructor
        this.weight = weight;
    }

    // 4. Getter and Setter for the new property
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
