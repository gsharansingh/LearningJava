import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        Scanner inputObject = new Scanner(System.in);
        while(count != 10){
            System.out.println("Enter Number #"+ (count+1) + ":");
            boolean hasNextInt = inputObject.hasNextInt();
            if (hasNextInt) {
                int anyNumber = inputObject.nextInt();
                count++;
                sum += anyNumber;
            } else {
                System.out.println("Invalid Number!!");
            }
            inputObject.nextLine();
        }
        inputObject.close();
        System.out.println("Sum of the Numbers = " + sum);
    }
}