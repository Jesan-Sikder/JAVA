class Dog{
    String breed;
    int age;
    String color;


    public void setBreed(String breed){
        this.breed= breed;
    }
    public void setAge(int age){
        this.age= age;
    }
    public void setColor(String color){
        this.color= color;
    }
public void print(){
    System.out.println("Dogo tales : " );
    System.out.println(this.breed+" , "+this.age+" , "+this.color );
// System.out.println(this.breed);
//     System.out.println(this.age);
//     System.out.println(this.color);
}
}
public class Main{
public static void main(String[] args) {
    Dog d1 = new Dog();
    d1.setBreed("Golden Retriever");
    d1.setAge(2);
    d1.setColor("Golden");
    d1.print();


}
}