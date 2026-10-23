package ac.rca.oop.pormorphism;

public class Arithmetic {
    /*
    * Overloading*/

    public int addition(){
        return 10 + 20;

    }
    public int addition(int a, int b){
        return a + b;
    }
    public void addition(int b){
        System.out.println(b);
    }
    public double addtion (double a){
        return  a + 10;
    }
    public double addition(double a, int b){
        return  a+b;
    }
    public double addition(double a, double b){
        return a + b;

    }
    public long addition(long a, long b){
        return a+b;
    }
    public int addition(int a, int b, int c, int d){
        return a + b+ c +d;
    }
}
