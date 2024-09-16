package homework;

public class Main {
    public static void main(String[] args) {
        // Test FootballStats
        FootballStats footballPlayer = new FootballStats("John Doe", 20, 15);
        System.out.println("Football Player Stats:");
        footballPlayer.displayStats();
        System.out.println();

        // Test CricketStats
        CricketStats cricketPlayer = new CricketStats("Jane Doe", 10, 200);
        System.out.println("Cricket Player Stats:");
        cricketPlayer.displayStats();
    }
}
