public class Dog extends AnimalC{
    private int legs;

    public Dog(int legs){
        super("Dog", 1, 15);
        this.legs = legs;
    }
    
    public void Display(){
        System.out.println("legs = " + legs);
        return;
    }

    public void Dis(){
        Display();
        super.Display();
    }
}