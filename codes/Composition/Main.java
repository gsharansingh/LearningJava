public class Main {
    public static void main (String[] args) {
        Table theTable = new Table("Wood Works", new Dimension(10, 5, 2));
        House house = new House(new Table("Wood Works", new Dimension(10, 5, 2)), new Tv("Onida", 300, new Dimension(10, 19, 1)));

        house.getAll();
        theTable.getDimension().getHeight();
        System.out.println(theTable.getName());
    }
}