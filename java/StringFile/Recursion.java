public class Recursion {
    // foRMUL a 
    // factorial (0) =1
    // factorial(n)=n* factorial(n-1)
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

    static int factorial_iteriative(int n){
        if(n==0 || n==1){
            return 1;

        }else{
            int product =1;
            for(int i=1;i<=n;i++){
                product*= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int x= 5;
        System.out.println("the value of factorial n is "+ factorial(x));
        System.out.println("the value of factorial_iteriative n is "+ factorial_iteriative(x));

    }
}
