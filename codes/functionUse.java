public class functionUse {
    public static void main (String[] args) {
        int radius = 12;
        double pi = 3.14;
        int cont = 2;
        double area;
        area = calculateArea (radius, pi, cont);
        System.out.println("Area of the circle = " + area);
        calculateArea(12, 3, 3);

    }

    public static float calculateArea(int r, double pi, int c){
        float area;
        area = (float)(c*pi*r);
        return area;
    }
}