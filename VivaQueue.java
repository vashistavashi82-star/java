import java.util.LinkedList;
import java.util.Queue;

public class VivaQueue {
    public static void main(String[] args) {
        // Create a queue to hold students
        Queue<String> studentsQueue = new LinkedList<>();

        // Add 5 students to the queue
        studentsQueue.add("vashista");
        studentsQueue.add("thousif");
        studentsQueue.add("revanth");
        studentsQueue.add("chandu");
        studentsQueue.add("shyam");

        System.out.println("Queue of students for viva:");
        System.out.println(studentsQueue);

        System.out.println("\nCalling students one by one for viva:");

        // Process each student in the queue
        while (!studentsQueue.isEmpty()) {
            String student = studentsQueue.poll(); // removes from front
            System.out.println(student + " is attending viva.");
        }

        System.out.println("\nAll students have completed their viva.");
    }
}