import java.util.Scanner;
public class Chp4test {
    public static void main(String[] args) {
        ///pracrice set
        // int a=10;
        // if(a == 11){
        //     System.out.println("iam 11");
        // }else{
        //     System.out.println("I am not");
        // }

        //student paas or fails
// byte m1,m2,m3;
// Scanner sc= new Scanner(System.in);
// System.out.println("Enter your marks in java");
// m1 =sc.nextByte();
// System.out.println("Enter your marks in c");
// m2=sc.nextByte();
// System.out.println("Enter your marks in android");
// m3=sc.nextByte();
// float avg =(m1+m2+m3)/3.0f;
// System.out.println("You are total avarage percentage is :"+avg);
// if(avg>40 && m1>=33 && m2>=33 && m3 >=33){
//     System.out.println("Congrats you are promoted");
// }else{
//     System.out.println("Go back to study your are failed");
// }

/////////////////////////////////////////
//calculate the income tax
// System.out.println("Enter your income as per annual:");
// Scanner sc = new Scanner(System.in);
// float tax =0;
// float income= sc.nextFloat();
// if(income <2.5f){
//     tax = tax+0;
// }else if(income >2.5f && income<=5f){
//     tax = tax + 0.05f * (income -2.5f);
// }else if(income>5f && income<=10.0f){
//     tax = tax + 0.05f * (5.0f -2.5f);
//     tax =tax + 0.2f *(income -5f);

// }else if(income>10.0f){
//     tax =tax+0.05f *(income- 2.5f);
//     tax =tax+0.2f *(10.0f - 5f);
//     tax = tax + 0.3f *(income - 10.0f);
// }
// System.out.println("The total Tax pay by the employee is the : "+tax);

Scanner sc= new Scanner(System.in);
System.out.println("Enter the number:");
int day = sc.nextInt();

switch (day) {
    case 1->System.out.println("Sunday");
    case 2 ->System.out.println("Monday");
    case 3 ->System.out.println("Tuesday");
    case 4 ->System.out.println("thursday");
    case 5 ->System.out.println("Wednesday");
    case 6 ->System.out.println("Friday");
    case 7 ->System.out.println("Saturday");
    default->System.out.println("Week not defined well");

}



    }
}
