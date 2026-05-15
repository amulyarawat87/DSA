//How to run this code:
//Run the code using java LruCache.java

import java.util.*;

class Node{
    Node prev = null;
    Node next = null;
    int key;
    int value;

    public Node(int key, int value){
        this.key = key;
        this.value = value;
        prev = null;
        next = null;
    }


}

class LRUCacheInterface {
    private Node start;
    private Node end;
    private int size;
    private Map<Integer, Node> hash;

    public LRUCacheInterface(int capacity) {
        hash = new HashMap<>();
        start = null;
        end = null;
        size = capacity;
    }
    
    public int get(int key) {
        if(hash.containsKey(key)){
            int value = hash.get(key).value;
            removeNode(key);
            addNodeAtFront(key, value);
            return value;
        }
        return -1; 
    }
    
    public void put(int key, int value) {
        if(hash.containsKey(key)) removeNode(key);
        else if(hash.size()==size) removeNode(end.key);
        addNodeAtFront(key, value);
    }

    public void removeNode(int key){
            Node currNode = hash.get(key);
            hash.remove(key);
            if(currNode == start){
                if(start.next!=null){
                    start = start.next;
                    start.prev = null;
                }
                else{
                    start = null;
                    end = null;
                }
            }
            else if(currNode==end){
                if(end.prev!=null){
                    end = end.prev;
                    end.next = null;
                }
                else{
                    start = null;
                    end = null;
                }
            }
            else{
                Node currPrev = currNode.prev;
                Node currNext = currNode.next;
                currPrev.next = currNext;
                currNext.prev = currPrev;
            }
    }

    public void addNodeAtFront(int key, int value){
        Node newNode = new Node(key, value);
        hash.put(key,newNode);
        if(start==null){
            start = newNode;
            end = newNode;
        }
        else{
            Node temp = start;
            start = newNode;
            start.prev = null;
            start.next = temp;
            temp.prev = start;
        }
    }
}

class LruCache {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the capacity of the LRU Cache:");
        int capacity = input.nextInt();
        LRUCacheInterface cache = new LRUCacheInterface(capacity);
        System.out.println("LRU Cache created with capacity: " + capacity);
        


        while(true){
            System.out.println("Enter 1 to get a value"); 
            System.out.println("Enter 2 to put a value");
            System.out.println("Enter any other number to exit:");
            switch (input.nextInt()) {
                case 1:
                    System.out.println("Enter the key to get:");
                    int key = input.nextInt();
                    System.out.println(cache.get(key));
                    break;
                case 2:
                    System.out.println("Enter the key and value to put:");
                    int putKey = input.nextInt();
                    int putValue = input.nextInt();
                    cache.put(putKey, putValue);
                    break;
            
                default:
                    System.out.println("Invalid input. Exiting...");
                    input.close();
                    System.exit(0);
            }
            
        }
    }
}
