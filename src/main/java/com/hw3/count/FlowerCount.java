package main.java.com.hw3.count;

public class FlowerCount {
    private static int count;
    public FlowerCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
