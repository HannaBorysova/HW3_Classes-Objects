package main.java.com.hw3.count;

public class FlowersCount {
    private static int count;
    public FlowersCount() {
        count++;
    }
    public static int getCount() {
        return count;
    }
}
