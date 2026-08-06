class TextEditor {
    private class Node{
        char val;
        Node next;
        Node prev;
        Node(char val){
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }
    private String getlefttext(){
        StringBuilder result = new StringBuilder();
        Node temp = cursor;
        int count = 0;
        while(temp != head && count < 10){
            result.append(temp.val);
            temp = temp.prev;
            count++;
        }
        return result.reverse().toString();
    }
    Node head;
    Node tail;
    Node cursor;
    public TextEditor() {
        head = new Node('\0');
        tail = new Node('\0');
        head.next = tail;
        tail.prev = head;
        cursor = head;
    }
    
    public void addText(String text) {
        for(int i = 0; i < text.length(); i++){
            Node newnode = new Node(text.charAt(i));
            Node next = cursor.next;
            cursor.next = newnode;
            newnode.prev = cursor;
            newnode.next = next;
            next.prev = newnode;
            cursor = newnode;
        }
    }
    
    public int deleteText(int k) {
        int deleted = 0;
        while(deleted < k && cursor != head){
            Node before = cursor.prev;
            Node next = cursor.next;
            before.next = next;
            next.prev = before;
            cursor = before;
            deleted++;
        }
        return deleted;
    }
    
    public String cursorLeft(int k) {
        for(int i = 0; i < k; i++){
            if(cursor == head){
                break;
            }
            cursor = cursor.prev;   
        }
        return getlefttext();
    }
    
    public String cursorRight(int k) {
        for(int i = 0; i < k; i++){
            if(cursor.next == tail){
                break;
            }
            cursor = cursor.next;
        }
        return getlefttext();
    }
}

/**
 * Your TextEditor object will be instantiated and called as such:
 * TextEditor obj = new TextEditor();
 * obj.addText(text);
 * int param_2 = obj.deleteText(k);
 * String param_3 = obj.cursorLeft(k);
 * String param_4 = obj.cursorRight(k);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna