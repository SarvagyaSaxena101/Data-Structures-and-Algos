package recursion_practice.Recursion_arrays;

public class print_array {
    public static void printArray(int[] x,int indx){
        if(indx < x.length){
            System.out.print(x[indx] + " ");
        }else{
            return;
        }
        printArray(x, indx+1);
    }
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6,7,8,9,10};
        printArray(x,0);
    }
}
