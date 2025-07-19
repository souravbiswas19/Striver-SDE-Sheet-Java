public class Add_Two_LinkedList {
    public ListNode addList(ListNode list1, ListNode list2)
    {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        int carry = 0;
        while(list1!=null || list2!=null || carry!=0)
        {
            int sum = carry;
            if(list1!=null)
            {
                sum+=list1.val;
                list1=list1.next;
            }
            if(list2!=null)
            {
                sum+=list2.val;
                list2=list2.next;
            }
            carry = sum/10;
            current.next = new ListNode(sum%10);
            current = current.next;
        }
        return dummy.next;
    }

    public void printList(ListNode head)
    {
        ListNode temp = head;
        while (temp!=null) {
            System.out.print(temp.val);
            if(temp.next!=null)
            {
                System.out.print("->");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(9);
        list1.next = new ListNode(9);
        list1.next.next = new ListNode(9);
        // list1.next.next.next = new ListNode(9);
        // list1.next.next.next.next = new ListNode(9);

        ListNode list2 = new ListNode(9);
        list2.next = new ListNode(9);
        list2.next.next = new ListNode(9);

        Add_Two_LinkedList ob = new Add_Two_LinkedList();
        System.out.print("List 1: ");
        ob.printList(list1);
        System.out.print("List 2: ");
        ob.printList(list2);

        // Add the list
        ListNode list3 = ob.addList(list1,list2);

        System.out.print("Added List: ");
        ob.printList(list3);
    }

}
