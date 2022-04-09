import java.util.Random;

public class RandomRolling {

    public static void main(String[] args) {
        Random random=new Random();
        int num=random.nextInt(10)+1;
        System.out.println("Your Number is "+" "+num);
    }

 }
