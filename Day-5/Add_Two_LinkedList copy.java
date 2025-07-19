public class Add_Two_LinkedList {
    public ListNode addList(ListNode list1, ListNode list2)
    {
        ListNode list3 = list1;
        while(list1!=null && list2!=null)
        {
            list1.val = list1.val + list2.val;
            list1 = list1.next;
            list2 = list2.next;
        }
        if(list2==null)
        {
            list1 = list1.next;
        }
        if(list1==null)
        {
            list1 = list2.next;
        }
        return list3;
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
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(5);

        ListNode list2 = new ListNode(3);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(5);

        Add_Two_LinkedList ob = new Add_Two_LinkedList();
        System.out.print("Original Lists: ");
        ob.printList(list1);
        ob.printList(list2);

        // Add the list
        ListNode list3 = ob.addList(list1,list2);

        System.out.print("Added List: ");
        ob.printList(list3);
    }

}
