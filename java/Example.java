class Area{
    static void Fun1(){
        System.out.println("f");
    }
    static void Fun2(){
        System.out.println("e");
    }
   
}


class Example{
    static void Fun1(){
   System.out.println("C");
    }
   static void Fun2(){
System.out.println("B");
    }
    public static void main(Str[]args){
        System.out.println("A");
        Fun1();
        Fun2();
        Area.Fun1();
        Area.Fun2();
    }
}