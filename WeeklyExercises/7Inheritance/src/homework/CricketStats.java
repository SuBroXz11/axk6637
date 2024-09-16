package homework;



//CricketStats class - Represents cricket-specific player statistics
class CricketStats extends PlayerStats {
private int runsScored;

public CricketStats(String playerName, int gamesPlayed, int runsScored) {
   super(playerName, gamesPlayed);
   this.runsScored = runsScored;
}

@Override
public void displayStats() {
   super.displayStats();
   System.out.println("Runs Scored: " + runsScored);
}
}
