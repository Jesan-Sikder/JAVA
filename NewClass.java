public class NewClass {
     int max = 100;   //instance variable
   static int var = 50;    // static variable   
   public static void main(String[] args) 
  {
       int a = 10, b = 20;      // local variable
       System.out.println(a+b);  
        NewClass obj = new NewClass();      
       System.out.println(obj.max);        
      System.out.println(var);                     
        sum();
  }
    public static void sum()
   {        
      NewClass obj = new NewClass();
         System.out.println(obj.max);        
        System.out.println(var);        
        //System.out.println(a+b);
    }        
 }
     

