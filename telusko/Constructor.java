package telusko;

class InnerThiskey {
    private int age;
    private String name;
    public InnerThiskey(){
        name ="sakshikdVE";
        age=12;   

}
    
    public int getAge (){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public String getName( ){
       
        return name;
    }
    // public void setName(String name, InnerThiskey obj){
    //     InnerThiskey obj1 = obj;
    //     obj1.name = name;
    // }    
    
    public void setName(String name){
        this.name = name;
    }
        
    }

public class Constructor {
    public static void main(String[] args) {
        InnerThiskey obj =new InnerThiskey();
        InnerThiskey obj2= new InnerThiskey(18,"Saksi"); 
        System.out.println(obj.getName() + ":"+ obj.getAge());

    // obj.setName ("sakshi");
    // obj.setAge(21); 
   
    }
}
