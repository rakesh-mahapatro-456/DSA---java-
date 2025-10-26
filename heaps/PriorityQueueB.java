import java.util.*;


public class PriorityQueueB {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name,int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // pq.add(3); //O(log n)
        // pq.add(4);
        // pq.add(1);
        // pq.add(7);

        // while (!pq.isEmpty()) {
        //     System.out.println(pq.peek());//O(1)
        //     pq.remove();//O(log n)
        // }

        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 5)); //O(log n)
        pq.add(new Student("B", 1));
        pq.add(new Student("C", 0));
        pq.add(new Student("D", 15));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name +"->" +pq.peek().rank);//O(1)
            pq.remove();//O(log n)
        }
    }
}