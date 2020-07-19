public class Dimension {
    private int lenght;
    private int breadth;
    private int height;

    public Dimension (int lenght, int breadth, int height) {
        this.lenght = lenght;
        this.breadth = breadth;
        this.height = height;
    }

    public int getLenght() {
        return lenght;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getHeight() {
        System.out.println(height);
        return height;
    }
    
}