package homework;

//FootballStats class - Represents football-specific player statistics
class FootballStats extends PlayerStats {
private int goalsScored;

public FootballStats(String playerName, int gamesPlayed, int goalsScored) {
   super(playerName, gamesPlayed);
   this.goalsScored = goalsScored;
}

@Override
public void displayStats() {
   super.displayStats();
   System.out.println("Goals Scored: " + goalsScored);
}
}
