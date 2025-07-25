public class LinkedList_Y_Intersect {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB==null) 
            return null;
        ListNode a=headA, b=headB;
        while(a!=b)
        {
            a=(a==null)?headB:a.next;
            b=(b==null)?headA:b.next;
        }
        return b;
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
        head.next = new ListNode(3);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(9);

        ListNode head1 = new ListNode(2);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(6);
        head1.next.next.next = new ListNode(8);
        head1.next.next.next.next = head.next.next;

        LinkedList_Y_Intersect solution = new LinkedList_Y_Intersect();

        System.out.print("List 1: ");
        solution.printList(head);
        System.out.print("List 2: ");
        solution.printList(head1);
        // Reverse the list
        ListNode merged = solution.getIntersectionNode(head, head1);

        System.out.print("Intersecting Node is: ");
        solution.printList(merged);
    }
}
