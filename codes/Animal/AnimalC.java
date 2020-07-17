public class AnimalC{
    private String name;
    private int size;
    private int weight;

    public AnimalC(String name, int size, int weight){
        this.name = name;
        this.size = size;
        this.weight = weight;
    }

    public void Display(){
        System.out.println("Name = "+name+ "\nSize = "+size+ "\nWeight = "+weight);
        return;
    }
}