class MyHashMap {
        private Integer arr[] =new Integer[1000001];
    public MyHashMap() {
        arr=this.arr;
    }
    
    public void put(int key, int value) {
        arr[key]=value;
    }
    
    public int get(int key) {
        if(arr[key]!=null){
            return arr[key];
        }
        return -1;
    }
    
    public void remove(int key) {
        arr[key]=null;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */