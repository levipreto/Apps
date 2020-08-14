package Misc.Multithreading.src;

class Task1 extends Thread {
    public void run() {
        System.out.println("\nTask 1 started ");

        for (int i = 101; i <= 199; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nTask 1 done ");
    }
}

class Task2 implements Runnable {

    @Override
    public void run() {
        System.out.println("\nTask 2 started ");

        for (int i = 201; i <= 299; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nTask 2 done ");
    }
}

public class ThreadBasicsRunner {

    public static void main(String[] args) throws InterruptedException {
        // Task 1
        System.out.println("\nTask1 Kicked Off");
        Task1 task1 = new Task1();
        task1.setPriority(1);
        task1.start();

        // Task 2
        System.out.println("\nTask2 Kicked Off");
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.setPriority(10);
        task2Thread.start();

        //Wait for task 1 to complete execution
        task1.join();
        task2Thread.join();

        // Task 3
        System.out.println("\nTask3 Kicked Off");
        for (int i = 301; i <= 399; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask 3 done");
        System.out.println("\nMain done");

    }
}