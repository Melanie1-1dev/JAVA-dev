package ac.rca.oop.Streams;

public class Point<T> {
    private T X;
    private T Y;

    public Point() {}

    public Point(T X, T Y) {
        this.X = X;
        this.Y = Y;
    }

    public T getX() {
        return X;
    }

    public void setX(T X) {
        this.X = X;
    }

    public T getY() {
        return Y;
    }

    public void setY(T Y) {
        this.Y = Y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + X +
                ", Y=" + Y +
                '}';
    }
}
