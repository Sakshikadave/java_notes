public class Varargs {
    
    static int sum(int x ,int ...arr){
        int result = x;
        for (int a : arr) {
            result += a;
        }
        return result; 
    }


    public static void main(String[] args) {
        System.out.println(sum(4, 5)); 
        System.out.println(sum(4, 5, 6,7)); 
    }
}
