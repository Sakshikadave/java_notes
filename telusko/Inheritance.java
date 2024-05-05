package telusko;

public class Inheritance {
    public static void main(String[] args) {
    VeryAdvCalc obj = new VeryAdvCalc();
    int e1 = obj.add(5,7);
    int e2 = obj.sub(6,9);
    int e3= obj.multi(2,5);
    int e4 = obj.div(5,8);
    double e5 = obj.power(4,8);
System.out.println(e1+ " "+ e2 + " "+e3+" "+e4 + " " + e5);
}
}
