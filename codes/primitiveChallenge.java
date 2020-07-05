public class primitiveChallenge {
    public static void main(String[] args){
        byte b = 60;
        short s = 2000;
        int i = 10000;
        long l = (50_000L) + (10L*(b+s+i));
        System.out.println(l);

        //floating point primitive challenge
        float weightPounds = 34.5f;
        float weightKgs = (float)(weightPounds * 0.45359237);
        System.out.println("Weight in KGs = " + weightKgs);

    }
}