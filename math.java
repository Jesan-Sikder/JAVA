// public class math {
//     public static void main(String [] args){
//         int a = -1;
//         double b = 2.69;
// System.out.println("answer will be -> "+Math.abs(a));
// System.out.println("answer will be -> "+Math.ceil(b));
// System.out.println("answer will be -> "+Math.floor(b));
// System.out.println("answer will be -> "+Math.max(a,b));
// System.out.println("answer will be -> "+Math.min(a,b));
// System.out.println("answer will be -> " + (100 + Math.random() * 100));




//     }
// }
import java.util.Random;

public class math {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("Five random numbers between 100 and 200:");
        for (int i = 0; i < 5; i++) {
            int randomNum = rand.nextInt(101) + 100; // (200 - 100 + 1) = 101
            System.out.println(randomNum);
        }
    }
}
