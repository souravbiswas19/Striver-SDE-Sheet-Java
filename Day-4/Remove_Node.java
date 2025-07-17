public class Remove_Node {
    public ListNode removeNode(ListNode head, int n)
    {
        int count=0, rem; 
        ListNode current = head, dummy = new ListNode();
        dummy.next = head;
        while(current != null)
        {
            ListNode nextnode = current.next; //Save the next node
            current = nextnode;
            ++count;  //move current to nextnode
        }
        current = dummy;
        rem = count - n;
        for(int i=0;i<rem;i++)
        {
            current = current.next;
        }
        current.next = current.next.next;
        return dummy.next;
    }
    public void printList(ListNode head)
    {
        ListNode temp = head;
        while (temp!=null) {
            System.out.print(temp.val);
            if(temp.next!=null)
            {
                System.out.print("->");;
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Remove_Node solution = new Remove_Node();
        int n=2;
        System.out.print("Original List: ");
        solution.printList(head);

        // Reverse the list
        ListNode newnode = solution.removeNode(head,n);

        System.out.print("Reversed List: ");
        solution.printList(newnode);
    }
}
