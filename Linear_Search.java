import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int searchelement = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(arr[i] == searchelement){
                System.out.println(i);
                break;
            }
        }
    }
}
