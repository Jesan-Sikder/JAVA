import java.util.Scanner;


public class e1{




    public static void p(Object o){
        System.out.println(o);
    }

public static void main(String[] agrs){
Scanner sc = new Scanner(System.in);
p("Give 5 subjects Marks out of 100 please : ");



float a = sc.nextFloat();
float b = sc.nextFloat();
float c = sc.nextFloat();
float d = sc.nextFloat();
float e = sc.nextFloat();
float sum = a+b+c+d+e;
p(sum);
   float per = (sum/500)*100;
        System.out.println(per+" %");
}














}










