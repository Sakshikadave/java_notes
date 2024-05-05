package telusko;

import javax.lang.model.element.Name;

class InnerThiskey {
int age;
String name;

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

public class Thiskey{
public static void main(String[] args) {
    InnerThiskey obj =new InnerThiskey();
    obj.setName ("sakshi");
    obj.setAge(21); 
    System.out.println(obj.getName() + ":"+ obj.getAge());
}
}