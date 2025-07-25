public class Reverse_LLinKGroups {
    public ListNode reverseListinKgroup(ListNode head, int k)
    {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev=dummy, curr=dummy, nex=dummy;
        int count = 0;
        while(curr.next!=null)
        {
            count++;
            curr = curr.next;
        }
        while(count>=k)
        {
            curr = prev.next;
            nex = curr.next;
            for(int i=1; i<k; i++)
            {
                curr.next = nex.next;
                nex.next = prev.next;
                prev.next = nex;
                nex = curr.next;
            }
            count-=k;
            prev = curr;
        }
        return dummy.next;
    }

    public void printList(ListNode head)
    {
        ListNode temp = head;
        while (temp!=null) {
            System.out.print(temp.val);
            if(temp.next!=null)
                System.out.print("->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next= new ListNode(4);
        head.next.next.next.next= new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next= new ListNode(7);
        head.next.next.next.next.next.next.next= new ListNode(8);
        // head.next.next.next.next.next.next.next.next= new ListNode(9);

        Reverse_LLinKGroups ob = new Reverse_LLinKGroups();
        ob.printList(head);
        ListNode newnode = ob.reverseListinKgroup(head, 3);
        ob.printList(newnode);
    }
}
