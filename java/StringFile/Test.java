import java.util.Scanner;

public class Test {

    //tolowercase
    public static void main(String[]args){
        String name = "Sakshi";
         name =name.toLowerCase();
        System.out.println(name);
    

    ///replace
    String text = "Replace the contaent";
    text = text.replace(" ","_");
    System.out.println(text);

    //replce
    // Scanner sc = new Scanner(System.in);
    String letter= "Dear <|Name|> , How are you";
    letter = letter.replace("<|Name|>", "Sakshi");
    System.out.println(letter);

//remove spaces
String MyString = " String  letter Dear   <|Name|> , How are you";
System.out.println(MyString.indexOf("  "));
System.out.println(MyString.indexOf("    "));

//trim
String Mytrim = " String  letter Dear   <|Name|> , How are you";
Mytrim = Mytrim.trim();
System.out.println(Mytrim);

//letter

String newLetter = "Hii Sakshi, \nThis is java Series. \n\tThank You";
System.out.println(newLetter);
}
}
