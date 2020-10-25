
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        ArrayList<Game> games = readRecordsFromFile(file);
        System.out.println("Team:");
        String team = scan.nextLine();
        ArrayList<String> teams = new ArrayList<>();
        // for (Game game : games) {
        // String[] gameTeams = game.getTeams();
        // for (String gameTeam : gameTeams) {
        // if (!teams.contains(gameTeam)) {
        // teams.add(gameTeam);
        // }
        // }
        // }
        // if (!teams.contains(team)) {
        // System.out.println("Team not found.");
        // return;
        // }
        int totalGames = 0;
        int wins = 0;
        for (Game game : games) {
            for (String gameTeam : game.getTeams()) {
                if (team.equals(gameTeam)) {
                    totalGames++;
                    if (game.getWinner().equals(team)) {
                        wins++;
                    }
                }
            }
        }
        System.out.println("Games: " + totalGames);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (totalGames - wins));
    }

    public static ArrayList<Game> readRecordsFromFile(String file) {
        ArrayList<Game> games = new ArrayList<>();
        try (Scanner fScanner = new Scanner(Paths.get(file))) {
            while (fScanner.hasNextLine()) {
                String line = fScanner.nextLine();
                String[] split = line.split(",");
                games.add(new Game(split[0], split[1], Integer.valueOf(split[2]), Integer.valueOf(split[3])));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return games;

    }
}
