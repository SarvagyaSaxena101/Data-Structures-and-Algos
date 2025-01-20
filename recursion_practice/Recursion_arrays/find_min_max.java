package recursion_practice.Recursion_arrays;

public class find_min_max {
    public static int find(int[] i,int indx){
        if(indx == i.length) return 0;
        if(i[indx] > find(i, indx+1)){
            return i[indx];
        }else{
            return find(i, indx+1);
        }

    }
    public static void main(String[] args) {
        int[] i = {1,2,5,3};
        System.out.println(find(i,0));
    }
    
}
