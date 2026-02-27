public class studen {
    private String id ;
    private  String name;
    private  double cgpa;
    public void insert_record(String id, String name,double cgpa){
        this.id = id;
        this.name= name;
        this.cgpa = cgpa;

    }
    public void display_record(){
        System.out.println(id+" "+name+" "+cgpa);

    }
    public static void main(String[] args) {
        studen s= new studen();
        // s.id = "241-15-628";
        // s.name = "jesan";
        // s.cgpa = 3.40;
        s.insert_record("241-15-628", "jesan", 3.40);
        s.display_record();
    }
}
