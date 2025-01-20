package recursion_practice.Recursion_arrays;

public class linear_search_with_recurssion {
    public static void perform_Linear(int[] i, int key,int idx){
        if(idx == i.length){
             System.out.println("Not found");
             return;
        }
        else if (i[idx] == key){
            System.out.println(idx);
            return;
        }
        perform_Linear(i, key,idx+1);
    }

    public static void main(String[] args) {
        int[] i = {1,2,3,4,5,6,7,8,9};
        perform_Linear(i, 8,0);
    }
    
}
