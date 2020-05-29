package question05;

import java.util.ArrayList;
public class Solution {
    public static class ListNode {
        int val;
        ListNode next=null;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null) {
            return null;
        }
        ArrayList<Integer> res = new ArrayList<>();
        add(listNode,res);
        return res;
    }

    private void add(ListNode listNode, ArrayList<Integer> list) {
//        if (listNode.next != null) {
//            add(listNode.next,list);
//        }
//        list.add(listNode.val);

        if (listNode.next == null) {
            list.add(listNode.val);
            return;
        }
        list.add(listNode.val);
        add(listNode.next,list);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode root = new ListNode(1);
        root.next = new ListNode(3);
        ArrayList<Integer> result = s.printListFromTailToHead(root);
        for (Integer r:result
             ) {
            System.out.println(r);
        }

    }

}