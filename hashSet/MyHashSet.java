package hashSet;

import java.util.LinkedList;

class MyHashSet {
    private class Bucket{
        private LinkedList<Integer> elems; 
        public Bucket(){
            elems = new LinkedList<Integer>(); 
        }
        public void insertar(int i){
            elems.add(i); 

        }
        public boolean esta(int i){
            return elems.contains(i); 
        }
        public void eliminar(int i){
            elems.remove(elems.indexOf(i)); 
        }
    }
    int tam; 
    Bucket map[];  
    /** Initialize your data structure here. */
    public MyHashSet() {
        tam = 769; 
        map = new Bucket[tam]; 

    }
    
    public void add(int key) {
        int hash = key % tam; 
        if(map[hash] == null){
            map[hash] = new Bucket(); 
        }
        if(!contains(key)){
            map[hash].insertar(key);
        }
    }
    
    public void remove(int key) {
        int hash = key % tam; 
        if(contains(key)){
            map[hash].eliminar(key); 
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int hash = key % tam;

        return map[hash] != null && map[hash].esta(key); 
    }
    public static void main(String args[]){
        MyHashSet hs = new MyHashSet(); 
        hs.add(1);
        hs.add(2);
        boolean res = hs.contains(2); 
        res = hs.contains(3);
        res = hs.contains(2);
        hs.add(2);
        res= hs.contains(2);
        hs.remove(2); 
        res = hs.contains(2); 
        return; 
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
