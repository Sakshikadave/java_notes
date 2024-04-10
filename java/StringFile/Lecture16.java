

public class Lecture16 {
    public static void main(String[]args){
        int age = 17;
        if(age>=18){
         System.out.println("You can Drive");
        }else{
            System.out.println("You can not drive yet");
        }

        ///relational and logical operators
        boolean a = true;
        boolean b = false;
        // boolean c = true;
        // if(a&&b&&c){
        //     System.out.println("Y");
        // }else{
        //     System.out.println("N");
        // }

        if(a||b){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }
System.out.print("A is:");
        System.out.println(!a);
        System.out.print("B is:");
        System.out.println(!b);
}
}

