package Anudip;

class AverageCalculator implements Runnable {
    public void run() {
        double sum = 0;
        int n= 50;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        double average = sum / n;
        System.out.println("Average of first 50 numbers: " + average);
    }
}

class SquarePrinter implements Runnable {
    private int[] arr;

    public SquarePrinter(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        for (int num : arr) {
            System.out.println("Square of " + num + ": " + (num * num));
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds between prints
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}
public class MultiThreadExample {
	public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30};

        Thread avgThread = new Thread(new AverageCalculator());
        Thread squareThread = new Thread(new SquarePrinter(arr));

        avgThread.start();
        squareThread.start();

        try {
            avgThread.join(); // Wait for the averageThread to finish
            squareThread.join();  // Wait for the squareThread to finish
        } 
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("Main thread finished.");
    }
}
