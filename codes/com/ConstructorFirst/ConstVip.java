public class ConstVip{
    private String name;
    private int creditLimit;
    private String email;

    public ConstVip(){
        this("Default Name", 600, "Default Email");
    }
    public ConstVip(String name, String email){
        this(name, 600, email);
    }
    public ConstVip(String name, int creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public void getStatus(){
        System.out.println("Name of the person : "+ name +"\nCredit Limit : " + creditLimit + "\nEmail Address : " + email);
    }
}