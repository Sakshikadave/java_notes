class Student{
    int rollno;
    String name;
    int marks;
}

public class Arrayofobject {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.rollno =8;
        s1.name= "Sakshi";
        s1.marks = 87;
        Student s2=new Student();
        s2.rollno =9;
        s2.name= "samri";
        s2.marks = 83;
        Student s3=new Student();
        s3.rollno =10;
        s3.name= "gauri";
        s3.marks = 88;
        Student s4=new Student();
        s4.rollno =11;
        s4.name= "sonti";
        s4.marks = 80;
Student students[] =new Student[4];
students[0] =s1;
students[1]=s2;
students[2]=s3;
students[3]=s4;
for(int i =0;i<students.length;i++){
    System.out.println(students[i].name + ":"+students[i].marks);
}
        // int nums[] = new int [4];
        // nums[0] = 4;
        // nums[1] =5; 
        // nums[2]=6;
        // nums[3]=7;
        // for(int i=0; i<nums.length;i++){
        //     System.out.println(nums[i]);
        // }
    }
}
