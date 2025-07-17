public class Middle_of_LinkedList {
    public ListNode findMiddle(ListNode head) {
        int count=0, mid; 
        ListNode current = head,newnode=null;
        while(current != null)
        {
            ListNode nextnode = current.next; //Save the next node
            current = nextnode;
            count++;  //move current to nextnode
        }
        current = head;
        mid = count/2;
        count = 0;
        while(current != null)
        {
            count++;
            if(count>mid){
                newnode = current; //Save the next node
                break;
            }  //move current to nextnode
            current = current.next;
        }
        return newnode;
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

        Middle_of_LinkedList solution = new Middle_of_LinkedList();

        System.out.print("Original List: ");
        solution.printList(head);

        // Reverse the list
        ListNode midnode = solution.findMiddle(head);

        System.out.print("Reversed List: ");
        solution.printList(midnode);
    }
}
