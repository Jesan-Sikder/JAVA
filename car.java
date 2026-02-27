abstract class vehicle{
    public void startEngine(){
        System.out.println("Engine Started");
    }
}
public class car extends vehicle{
    private String color;
    public car(String color){
        this.color = color;
    }
    public void printDetails(){
        System.out.println("color of my car is "+this.color);

 
    }
    public  static void main(String [] args){
        car car1 = new car("Black");
        car1.printDetails();
        car1.startEngine();
    }
}