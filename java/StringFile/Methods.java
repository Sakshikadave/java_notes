
class Computer{
    public void playMusic(){
System.out.println("Music is playing...");
    }

    public String getMePen(int cost){
        if(cost >=10)
        return "pen";
        else
        return "The pen is cost rs 10";
    }
}



public class Methods {
    public static void main(String[] args) {
        
        Computer obj =new Computer();
        obj.playMusic();
        String str= obj.getMePen(2);
        System.out.println(str);
    }
}




// public class Methods {
//     static int logic(int x,int y){
   
//         int z;
//         if(x>y){
//            z= x+y;
//         }else{
//            z=  (x+y)* 5;
//         }
//        return z;
//     }
//     public static void main(String[] args) {
//         int a =2;
//         int b=3;
//         int c;
//         //object creation when you are not creating with static method
//         // Methods obj =new Methods();
//         // c= obj.logic(a, b);
//         c= logic(a, b);
//         int a1 =2;
//         int b2=3;
//         int c3;
//         //c3= obj.logic(a1, b2);
//         c3= logic(a1, b2);
//         System.out.println(c);
//         System.out.println(c3);
       
//     }
// }
