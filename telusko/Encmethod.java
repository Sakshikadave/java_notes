package telusko;


 class InnerEncmethod {

    // private int age =11;
    // private String name ="sakshi";

    private int age;
    private String name;

public int getAge(){
    return age;
}
public void setAge(int a){
    age =a;
}
public String getName(){
    return name;
}
public void setName(String b){
    name =b;
}
}

public class Encmethod {

    public static void main(String[] args) {
        InnerEncmethod obj = new InnerEncmethod();
        obj.setAge(30);
        obj.setName("sakushiiiiiiiiii");
        // obj.name ="sakshi";
        // obj.age =12;
        System.out.println(obj.getAge()+ ":" + obj.getName());
    }
}