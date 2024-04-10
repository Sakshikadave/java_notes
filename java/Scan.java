// // package co.company;
// import java.util.Scanner;
// public class Scan {
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         //System.out.println("Enter 1st number");
//         //int a = sc.nextInt();
//         // float a = sc.nextFloat()
//         // System.out.println("Enter Second number");
//         // float b =sc.nextFloat();
//         // float num = a+b;
//         // System.out.println("The total of number is:"+ num);
//         String str = sc.next();
//         System.out.println(str);
//     }

// }

import java.util.Scanner;

public class Scan{
    public static void main(String[]args){
        System.out.println("All Students marks and percentage calculate as below");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Marks");
        int sub1 = sc.nextInt();
        System.out.println("Enter the 2nd Marks");
        int sub2 = sc.nextInt();
        System.out.println("Enter the 3rd Marks");
        int sub3 = sc.nextInt();
        System.out.println("Enter the 4th Marks");
        int sub4 = sc.nextInt();
        System.out.println("Enter the 5th Marks");
        int sub5 = sc.nextInt();

        int total = sub1+sub2+sub3+sub4+sub5 ;
        int maxMarks = 100 * 5;
        double percentage = (double) total / maxMarks * 100;
   System.out.println("Total percentage of the marks is " + percentage );
    }
}