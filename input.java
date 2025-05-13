import java.util.Scanner;


public class input{
    /********************************************************* */
    public static void p(Object o) {
        System.out.println(o);
    }
     public static void ponly(Object o) {
        System.out.print(o);
    }
    /******************************************************* */
    public static void main(String[] args){
            


           p("Taking input : ");
     
 Scanner sc = new Scanner(System.in);
// p("Enter number 1 : ");
// int a = sc.nextInt();//taking input 
// p("Enter number 2 : ");
// int b = sc.nextInt();//taking input 
// int sum = a+b;
// p("The sum of these number is : ");
// p(sum);


// boolean b1 = sc.hasNextInt();//taking input 
// p(b1);


String str = sc.next();  // takes first word
sc.nextLine();           // clears the rest of the line
String strx = sc.nextLine(); // takes the full line
p(str);
 p("You entered: " + str);
 p("You entered: " + strx);


    }
}