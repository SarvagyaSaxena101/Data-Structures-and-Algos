package recursion_practice;

public class print_numbers {
    public static void numPrint(int i){
        if(i == 0){
            return; 
        }else{
            System.out.println(i);
            numPrint(i-1);
        }
    }
    public static void main(String[] args) {
        numPrint(5);
    }
}
    
