package main.java.algorithm.linkList;

/**
 * @Author yangxw
 * @Date 2020-09-16 上午9:10
 * @Description 注意不要再原链表上进行修改
 * @Version 1.0
 */
public class Solution24 {

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp;
        ListNode p = head;
        while (p != null) {
            temp = p.next;
            p.next = prev;
            prev = p;
            p = temp;
        }
        return prev;
    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.printf(head.val + "->");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        ListNode p4 = new ListNode(4);
        ListNode p5 = new ListNode(5);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = null;
//        print(p1);
        reverseList(p1);
        print(p1);
    }


    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
