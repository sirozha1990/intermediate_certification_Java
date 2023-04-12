package task;

import certification.main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Random;

public class ToyStore {

    private PriorityQueue<main> queue;

    public ToyStore() {
        queue = new PriorityQueue<>();
    }

    public void addToy(int id, String name, int weight) {
        main toy = new main(id, name, weight);
        queue.add(toy);
    }

    public int getToy() {
        Random rand = new Random();
        int num = rand.nextInt(10);
        if (num < 2) {
            return queue.peek().getId();
        } else if (num < 4) {
            main[] arr = new main[2];
            queue.toArray(arr);
            return arr[1].getId();
        } else {
            main[] arr = new main[3];
            queue.toArray(arr);
            return arr[2].getId();
        }
    }

    public void playGame() {
        try {
            PrintWriter writer = new PrintWriter("results.txt");
            for (int i = 0; i < 10; i++) {
                int id = getToy();
                writer.println("Toy with id " + id + " is the winner!");
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}