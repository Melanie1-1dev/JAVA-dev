package ac.rca.oop.inheritance;

public class Box {
    private int height;
    private int length;
    private int width;

    // Default Constructor
    public Box() {}

    // Parameterized Constructor
    public Box(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    // Getters and Setters
    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }

    public int getLength() { return length; }
    public void setLength(int length) { this.length = length; }

    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }

    // Moved inside the class and fixed the 'height' typo
    public int volume() {
        return length * width * height;
    }
}
