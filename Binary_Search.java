import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int start = 0;
        int end = arr.length-1;
        while (start<= end) {
            int mid = (start+end)/2;
            if (arr[mid] == key) {System.out.println(mid); break;}
            else if(arr[mid] > key) end = mid-1;
            else start = mid + 1;
        }
        sc.close();
    }
    
}
