package recursion_practice;

public class factorial_recursion {
    public static int factorial(int i){
        if(i == 1) return 1;
        return i * factorial(i-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    
}
