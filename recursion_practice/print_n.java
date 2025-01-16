package recursion_practice;

public class print_n {
    public static void fromn(int i){
        if (i == 0) {
            return;
        }
        System.out.println(i);
        fromn(i-1);
        System.out.println(i);
    }
    public static void main(String[] args) {
        fromn(5);
    }
}
