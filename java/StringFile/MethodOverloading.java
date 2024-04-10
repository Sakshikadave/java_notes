// public class MethodOverloading {
class  Loading{
    public int add(int n1 ,int n2){
        return n1+n2;
    }
    public int add(int n1 ,int n2,int n3){
        return n1+n2+n3;
    }
}
    public class MethodOverloading {
public static void main(String[] args) {

    Loading over =new Loading();
    int last = over.add(1,3);
    System.out.println(last);
}
    }
//     //method overloading
// static void foo(){
//     System.out.println("Good morning bro!");
// }
// static void foo(int a){
//     System.out.println("Good morning bro!"+a);
// }
// static void foo(int a,int b){
//     System.out.println("Good morning bro!"+a+b);
// }
//  //calling  static method without object
//     static void myName (){
//         System.out.println("My name is sakshi");
//     }
//     static void mycal2(int [] arr){
//         arr[0] =98;
//         // return arr;

//     }
//     //calling with object
//     static int mycal(int x,int y){
//     //  int z;
//     //  z= x+y;
//     //  return z;
//     return x+y;
//     }
//     public static void main(String[] args) {
//         // int a =2;
//         // int b=3;
//         // int c;
//         // c= myName(a,b);
//         // System.out.println(c);
//         //////////////////////////////////////
// int [] marks = {23,45,56,56,67};
// mycal2(marks);
// System.out.println(marks[0]);
// foo();
// foo(777);
// foo(333, 555);

//         ////static method with object
//         // int c;
//         // MethodOverloading cal =new MethodOverloading();
//         // c= cal.mycal(2,3);
//         // System.out.println(c);
//         // myName();
//     }
// }
