class Solution {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public int findTheWinner(int n, int k) {
        Node head = new Node(1);
        Node tail = head;
        for(int i = 2; i <= n; i++){
            tail.next = new Node(i);
            tail = tail.next;
        }
        tail.next = head;
        Node temp = tail;
        while(temp.next != temp){
            for(int i = 1; i < k; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        return temp.data;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna