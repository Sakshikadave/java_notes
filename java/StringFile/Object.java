// Class and object
 class Calc{
int a;
public int add(int n1,int n2){
int r = n1 +n2;
// System.out.println("in add");
return r;
}
}

public class Object {
    public static void main(String[] args) {
        int num=4;
        int num2=5;
       Calc myCalc = new Calc();
       int result = myCalc.add(num,num2);
       System.out.println(result);

    }
}
