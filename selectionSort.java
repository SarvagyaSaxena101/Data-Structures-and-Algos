public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        for(int i = 0; i < arr.length; i++){
            int idx = i;
        for(int j =i+1 ; j < arr.length; j++){
                if (arr[j] < arr[idx] ) {
                    idx = j;
                }
            } 
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
