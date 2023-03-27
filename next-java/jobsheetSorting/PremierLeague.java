package jobsheetSorting;

public class PremierLeague {
    String team, goal, points;
    int play;

    PremierLeague(String t, int p, int g, int pt) {
        team = t;
        play = p;
        goal = String.valueOf(g);
        points = String.valueOf(pt);
    }
}
