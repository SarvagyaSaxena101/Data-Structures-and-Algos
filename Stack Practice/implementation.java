import java.util.Stack;

public class implementation {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        st.push('I');
        st.push('N');
        st.push('D');
        st.push('I');
        st.push('A');
        
        System.out.println(st.pop());
        System.out.println(st.pop());

        System.out.println(st.peek());
        System.out.println(st.isEmpty());

        while (!st.isEmpty()) {
            System.out.print(st.pop());
        }
    }
}
