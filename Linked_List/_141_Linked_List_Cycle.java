public class _141_Linked_List_Cycle {
  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }
     
    public static boolean hasCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast)
        return true;
    }
    return false;
  }
    public static void main(String[] args) {
         ListNode a1 = new ListNode(3);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(0);
        ListNode a4 = new ListNode(-4);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        System.out.println(hasCycle(a1));
    }
}
