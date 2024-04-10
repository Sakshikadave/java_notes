
class Mobile{
     String brand;
     int price;
    static String name;

    static{
        name="Phone";
        System.out.println("in Static block");
    }
    public Mobile(){
        brand ="";
        price = 200;
        System.out.println("In constructure");
    }
    public void show(){
        System.out.println(brand + ":" + price + ":" + name );
    }
//static method uses in java
    public static void show2(Mobile obj){
        System.out.println(obj.brand + ":" + obj.price + ":" + obj.name);
    }
}

public class Staticvariable {
    public static void main(String[] args) {
       Mobile obj1 =new Mobile();
       obj1.brand ="Apple";
       obj1.price =15000;
       obj1.name="smart phone";

       Mobile obj2 = new Mobile();
       obj2.brand ="redmi";
       obj2.price =19000;
       obj2.name="smart watch";

    //    Mobile obj3 = new Mobile();
    //    obj3.brand ="samsung";
    //    obj3.price =16000;
    //    obj3.name="smart phone";

    //    Mobile obj4 = new Mobile();
    //    obj4.brand ="oppo";
    //    obj4.price =17000;
    //    obj4.name="smart phone";
    //    Mobile.name ="myphone";-------------all data of name will similar
obj1.show();
obj2.show(); 
// obj3.show();
// obj4.show();
Mobile.show2(obj1);

//block in java
Mobile obj4= new Mobile();


}
}
