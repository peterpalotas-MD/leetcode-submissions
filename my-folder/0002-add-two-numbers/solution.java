
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode current = head;
        int carry = 0;
        while (l1 !=null || l2 !=null){
            int l1value = l1==null ? 0 : l1.val;
            int l2value = l2==null ? 0 : l2.val;
            int sum = l1value+l2value+carry;

            carry=0;
            if(sum>=10){carry=1;}

            current.next= new ListNode(sum%10);

            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
            current=current.next;
        }

        if(carry==1){
            current.next= new ListNode(1);
        }
        return head.next;
    }
    
    public void printLinkedList(ListNode n){
        while(n!= null){
            System.out.println(n.val);
            n=n.next;
        }
    }
}
