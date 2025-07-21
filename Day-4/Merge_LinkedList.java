public class Merge_LinkedList {
    public ListNode mergeList(ListNode list1, ListNode list2)
    {
        // ListNode newnode, current=null;
        // newnode = current;
        // while(list1!=null && list2!=null)
        // {
        //     if(list1.val <= list2.val)
        //     {
        //         current.next = list1;
        //         list1 = list1.next;
        //     }
        //     else
        //     {
        //         current.next = list2;
        //         list2 = list2.next;
        //     }
        //     current = current.next;
        // }
        // current.next = (list1!=null)?list1:list2;
        // return newnode.next;
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        if(list1.val>list2.val)
        {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        ListNode res = list1;
        while(list1!=null && list2!=null)
        {
            ListNode tmp = null;
            while(list1!=null && list1.val<=list2.val)
            {
                tmp = list1;
                list1 = list1.next;
            }
            tmp.next = list2;
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        return res;
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
        head1.next.next.next.next = new ListNode(10);

        Merge_LinkedList solution = new Merge_LinkedList();

        System.out.print("List 1: ");
        solution.printList(head);
        System.out.print("List 2: ");
        solution.printList(head1);
        // Reverse the list
        ListNode merged = solution.mergeList(head, head1);

        System.out.print("Reversed List: ");
        solution.printList(merged);
    }
}
