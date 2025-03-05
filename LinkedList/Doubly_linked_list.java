class DLL{
    DLL prev;
    int val;
    DLL next;

    public DLL(int val){
        this.prev = null;
        this.next = null;
        this.val = val;
    }
    public static DLL addprev(DLL newnode,DLL head){
        head.prev = newnode;
        newnode.next = head;
        head = newnode;
        return head;
    }
    public static void addlast(DLL newNode, DLL head){
        DLL curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
    }
    public static void printList(DLL head){
        System.out.print(head.val + "----->");
        DLL curr= head;
        while (curr.next != null) {
            curr = curr.next;
            System.out.print(curr.val + "----->");
        }
        System.out.println();
    }
}

public class Doubly_linked_list {
    public static void main(String[] args) {
        DLL head = new DLL(1);
        DLL newNode = new DLL(2);
        DLL.addlast(newNode, head);
        
        DLL.printList(head);
        DLL newNode1 = new DLL(3);
        DLL.addlast(newNode1, head);
        DLL.printList(head);
    }
}