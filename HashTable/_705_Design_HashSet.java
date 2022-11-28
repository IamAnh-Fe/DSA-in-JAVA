public class _705_Design_HashSet {
    private boolean[] set = new boolean[1000001];
    public  void MyHashSet() {
        set = new boolean[1000001];
    }
    
    public void add(int key) {
        set[key] = true;
    }
    
    public void remove(int key) {
        set[key] = false;
    }
    
    public boolean contains(int key) {
        return set[key];
    }
    public static void main(String[] args) {
         _705_Design_HashSet myHashSet = new _705_Design_HashSet();
myHashSet.add(1);      // set = [1]
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(1); // return True
myHashSet.contains(3); // return False, (not found)
myHashSet.add(2);      // set = [1, 2]
System.out.println("mySet.contains(1): " + myHashSet.contains(2));
// myHashSet.contains(2); // return True
myHashSet.remove(2);   // set = [1]
myHashSet.contains(2); // return False, (already removed)
    }
}
