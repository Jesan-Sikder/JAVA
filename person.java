public class person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return age;
    }


    public static void main(String[] args) {
        person p1 = new person();
        p1.setName("jesan");
        p1.setId(23);
        System.out.println(p1.getName());
        System.out.println(p1.getId());

    }
}
