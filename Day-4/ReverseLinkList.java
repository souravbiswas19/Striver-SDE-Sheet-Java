public class ReverseLinkList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; 
        ListNode current = head;
        while(current != null)
        {
            ListNode nextnode = current.next; //Save the next node
            current.next = prev;  //reverse the link     
            prev = current;   //move prev forward
            current = nextnode;  //move current to nextnode
        }
        return prev;
    }

    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ReverseLinkList solution = new ReverseLinkList();

        System.out.print("Original List: ");
        solution.printList(head);

        // Reverse the list
        ListNode reversedHead = solution.reverseList(head);

        System.out.print("Reversed List: ");
        solution.printList(reversedHead);
    }
}
