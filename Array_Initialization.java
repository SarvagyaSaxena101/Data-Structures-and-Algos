import java.util.Scanner;
public class Array_Initialization {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter the element of the " + i + " Index");
            arr[i] = sc.nextInt();
        }
        System.out.println(arr);
        for(int i =0; i < arr.length; i++){
            if (i != arr.length-1) {
                System.out.print(arr[i] + ", ");
            }else{
                System.out.print(arr[i]);
            }
        }
    }
}
