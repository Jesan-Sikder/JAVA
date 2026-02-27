public class doctor{
    private String name;
   private String special;
   private int id;
   public  doctor(String name, int id,String special){
    this.name= name;
    this.id = id;
    this.special = special;
   }
   public String getName(){
    return name;
   }
   public int getId(){
    return id;
   }
public String getSpecial(){
    return special;
}

public void print_doctor(){
    System.out.println("Doctor Name : "+name+"Doctor Id : "+id+"Doctor specialization : "+special);

}
}