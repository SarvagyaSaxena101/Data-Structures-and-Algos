package recursion_practice.Recursion_arrays;

public class finding_min {
    
    public static int min(int[] i, int idx){
        if(idx == i.length) return Integer.MAX_VALUE;
        if(i[idx] < min(i, idx+1)) return i[idx];
        else return min(i, idx+1);
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        System.out.println(min(a, 0));
    }
    
}
