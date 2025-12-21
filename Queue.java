/*queue --> predefined interface in java util
First in first out for LinkedList, PriorityOrder for priorityQueue
Duplicate are allowed
Elements can't accessed by index.

*/

import java.util.PriorityQueue;

public class Queue {
    public static  void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(10);
        pq.add(20);
        pq.add(5);
        System.out.println(pq);
        for(Object i : pq){
            System.out.println(pq);
        }
        System.out.println("------------------");
        System.out.println(pq.poll()); 
    }
}