class MyLinkedList {

    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    Node head;
    int size;
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    public int get(int index) {
        if(index < 0){
            return -1;
        }
        Node temp = head;
        for(int i = 0; i < index; i++){
            if(temp == null){
                return -1;
            }
            temp = temp.next;
        }
        if(temp == null){
            return -1;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newnode = new Node(val);
        if(head == null){
            head = newnode;
            size++;
            return;
        }
        newnode.next = head;
        head = newnode;
        size++;
    }
    
    public void addAtTail(int val) {
        Node newnode = new Node(val);
        if(head == null){
            head = newnode;
            size++;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size){
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }
        if(index == size){
            addAtTail(val);
            return;
        }
        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            if(temp == null){
                return;
            }
            temp = temp.next;
        }
        if(temp == null){
            return;
        }
        Node newnode  = new Node(val);
        newnode.next = temp.next;
        temp.next = newnode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index > size){
            return;
        }
        if(head == null){
            return;
        }
        if(index == 0){
            head = head.next;
            size--;
            return;
        }
        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            if(temp == null || temp.next == null){
                return;
            }
            temp = temp.next;
        }
        if(temp == null || temp.next == null){
            return;
        }
        temp.next = temp.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna