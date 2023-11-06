class SeatManager {
    boolean[] seats;
    int min = 0;

    public SeatManager(int n) {
        seats = new boolean[n];
    }
    
    public int reserve() {
        for(int i = min ; i < seats.length ; i++) {
            if(!seats[i]) {
                seats[i] = true;
                min = i+1;
                return i+1;
            }
        }
        return -1;
    }
    
    public void unreserve(int seatNumber) {
        min = Math.min(seatNumber-1, min);
        seats[seatNumber-1] = false;
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */