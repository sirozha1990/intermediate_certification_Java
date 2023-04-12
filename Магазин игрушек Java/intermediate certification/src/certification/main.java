package certification;


import task.ToyStore;

public class main implements Comparable<main> {

    private int id;
    private String name;
    private int weight;

    public main(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(main other) {
        return Integer.compare(weight, other.weight);
    }

    public static void main(String[] args) {
        ToyStore store = new ToyStore();
        store.addToy(1, "car", 2);
        store.addToy(2, "robot", 2);
        store.addToy(3, "doll", 6);
        store.playGame();
    }
}