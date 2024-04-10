class A {
   int x;
   private static int y; 
   void fun1(){
      y= 22;
   }
   void fun2(){
      System.out.println(y);
   }
   void fun3(){
      y=45;
   }
}

class Object1{
   public static void main(Str[]args){
      A P1 =new A();
      A P2 = new A();
      P1.fun1();
      P2.fun3();
      P1.fun2();
   }
}