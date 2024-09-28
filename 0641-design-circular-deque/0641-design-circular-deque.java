class MyCircularDeque {
    int capa = 0;
    List<Integer> list;
    int size = 0;
    public MyCircularDeque(int k) {
        list = new ArrayList();
        capa = k;
        size = 0;
    }
    
    public boolean insertFront(int value) {
        if(size == capa) return false;
        list.add(0, value);
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(size == capa) return false;
        list.add(value);
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(size == 0) return false;
        list.remove(0);
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(size == 0) return false;
        list.remove(size-1);
        size--;
        return true;
    }
    
    public int getFront() {
        if(size == 0) return -1;
        return list.get(0);
    }
    
    public int getRear() {
        if(size == 0) return -1;
        return list.get(size-1);
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capa;
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