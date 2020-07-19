public class Table {
    private String name;
    private Dimension dimension;

    public Table(String name, Dimension dimension) {
        this.name = name;
        this.dimension = dimension;
    }
    public String getName() {
        return name;
    }

    public Dimension getDimension() {
        return dimension;
    }
    
}