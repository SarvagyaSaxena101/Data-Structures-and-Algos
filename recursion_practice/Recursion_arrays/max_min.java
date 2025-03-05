package recursion_practice.Recursion_arrays;

public class max_min {
    public static int[] max_min_1(int[] i, int idx ,int[] val){
        if(idx == i.length) return val;
        else if(i[idx] < val[0]) {
            val[0] = i[idx];
        }else if(i[idx] > val[1]){
            val[1] = i[idx];
        }
        return max_min_1(i, idx+1,val);
    }
    public static void main(String[] args) {
        int[] i = {1,2,3,4,5,6,7,7};
        int[] val = {Integer.MAX_VALUE,Integer.MIN_VALUE};
        int[] arr = max_min_1(i, 0, val);
            System.out.println(arr[0] + " " + arr[1]);
    }
    
}
