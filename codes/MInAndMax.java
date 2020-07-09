import java.util.Scanner;

public class MInAndMax {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean first = true;
        Scanner inputObject = new Scanner(System.in);
        while(true){
            System.out.println("Enter Number : ");
            boolean hasAnInt = inputObject.hasNextInt();
            if (hasAnInt) {
                int anyNumber = inputObject.nextInt();

                if (first){
                    first = false;
                }
                if (max < anyNumber){
                    max = anyNumber;
                }
                if (min > anyNumber) {
                    min = anyNumber;
                }
            } else {
                System.out.println("Invalid Number!!");
                break;
            }
            inputObject.nextLine();
        }
        inputObject.close();
        if (first){
            System.out.println("No Number Entered!!");
        } else {
            System.out.println("Minimum number : " + min);
            System.out.println("Maximum number : " + max);
        }
    }
}