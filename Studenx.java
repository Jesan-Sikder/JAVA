public class Studenx{
    private String name;
    private int roll;
    private String section;
    Studenx(String name , int roll, String section){
        this.name = name;
        this.roll= roll;
        this.section= section;
    }




    public void print(){
        System.out.println("Student Details : ");
        System.out.println(this.name+" , "+this.roll+" , "+this.section);
    }


    public static void main(String[] args){
        Studenx s1 = new Studenx("jesan",628,"red");
        s1.print();
    }
}