/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node current = head;
        if(head == null){
            return null;
        }
        while(current != null){
            if(current.child != null){
                Node next = current.next;
                Node childnode = current.child;
                while(childnode.next != null){
                    childnode = childnode.next;
                }
                current.next = current.child;
                current.child.prev = current;
                childnode.next = next;
                if(next != null){
                    next.prev = childnode;
                }
                current.child = null;
            }
            current = current.next;
        }
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna