public class Merge_LinkedList {
    public ListNode mergeList(ListNode list1, ListNode list2)
    {
        ListNode newnode, current=null;
        newnode = current;
        while(list1!=null && list2!=null)
        {
            if(list1.val <= list2.val)
            {
                current.next = list1;
                list1 = list1.next;
            }
            else
            {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        current.next = (list1!=null)?list1:list2;
        return newnode.next;
    }
}
