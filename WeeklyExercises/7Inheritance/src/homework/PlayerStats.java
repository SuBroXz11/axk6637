package homework;

//PlayerStats class - Represents the general player statistics
class PlayerStats {
 protected String playerName;
 protected int gamesPlayed;

 public PlayerStats(String playerName, int gamesPlayed) {
     this.playerName = playerName;
     this.gamesPlayed = gamesPlayed;
 }

 public void displayStats() {
     System.out.println("Player: " + playerName);
     System.out.println("Games Played: " + gamesPlayed);
 }
}

