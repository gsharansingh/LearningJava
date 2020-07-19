public class Tv {
    private String name;
    private int cost;
    private Dimension dimension;

    public Tv(String name, int cost, Dimension dimension) {
        this.name = name;
        this.cost = cost;
        this.dimension = dimension;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public Dimension getDimension() {
        return dimension;
    }

}