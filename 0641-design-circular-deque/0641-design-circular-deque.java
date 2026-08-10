class MyCircularDeque {
    int size;
    int front;
    int rear;
    int[] arr;
    int n;
    public MyCircularDeque(int k) {
        arr = new int[k];
        front = 0;
        rear = -1;
        size = 0;
        n = arr.length;
    }
    
    public boolean insertFront(int value) {
        if(size == n){
            return false;
        }
        if(size == 0){
            front = 0;
            rear = 0;
            size++;
            arr[front] = value;
            return true;
        }
        front = (front - 1 + n) % n;
        arr[front] = value;
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(size == n){
            return false;
        }
        if(size == 0){
            front = 0;
            rear = 0;
            size++;
            arr[rear] = value;
            return true;
        }
        rear = (rear + 1) % n;
        arr[rear] = value;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(size == 0){
            return false;
        }
        if(front == rear){
            front = 0;
            rear = -1;
            size--;
            return true;
        }
        front = (front + 1) % n;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(size == 0){
            return false;
        }
        if(front == rear){
            front = 0;
            rear = -1;
            size--;
            return true;
        }
        rear = (rear - 1 + n) % n;
        size--;
        return true;
    }
    
    public int getFront() {
        if(size == 0){
            return -1;
        }
        return arr[front];
    }
    
    public int getRear() {
        if(size == 0){
            return -1;
        }
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == n;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna