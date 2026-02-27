public class appo {
    private int date;
   private int time;
   private int appoid;
    private int pid;
    private int id;
    public appo(int appoid,int date,int time,int pid,int id){
this.appoid= appoid;
this.date= date;
this.time = time;
this.pid= pid;
this.id = id;
    }



    public int getAppoid(){
         return appoid;
    }
    public int getDate(){
         return date;
    }
    public int getTime(){
        return time;

    }
    public int getPid(){
        return pid;
    }
    public int getId(){
        return id;
    }

    public void display(){
        System.out.println("Appointment id: "+appoid+"date: "+date+"time : "+time+"patient id: "+pid+
        "doctor id : "+id);
    }
}
