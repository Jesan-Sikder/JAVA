public class patient {
    
   private String pname;
   private int page;
   private int pid;
   private int id;
   public  patient(String pname, int pid,int page,int id){
    this.pname= pname;
    this.pid = pid;
    this.page = page;
    this.id = id;
   }
   public String getPname(){
    return pname;
   }
   public int getPid(){
    return pid;

   }
   public int getPage()
   {
    return page;

   }


   public int getId()
   {
    return id;

   }
   public void print_patient(){
    System.out.println("patient Name : "+pname+"patient Id : "+pid+"patient age : "+page+"Doctor Id : "+id);

}
}

