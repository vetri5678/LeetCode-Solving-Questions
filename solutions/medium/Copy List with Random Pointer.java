// Title: Copy List with Random Pointer
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/copy-list-with-random-pointer/

            if (curr.random != null) {

        while (curr != null) {

        // Step 2: Copy random pointers
        curr = head;

        // Step 1: Create copied nodes
        Node curr = head;

        while (curr != null) {
            Node newNode = new Node(curr.val);

            newNode.next = curr.next;
            curr.next = newNode;

            curr = newNode.next;
        }

            return null;
        }
    public Node copyRandomList(Node head) {

        if (head == null) {
class Solution {
