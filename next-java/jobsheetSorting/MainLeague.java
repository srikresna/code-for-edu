package jobsheetSorting;

import java.util.Scanner;

public class MainLeague {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PremierLeagueService pl = new PremierLeagueService();
        pl.add(new PremierLeague("Liverpool", 29, 45, 82));
        pl.add(new PremierLeague("Manchester City", 27, 39, 57));
        pl.add(new PremierLeague("Leicester City", 28, 26, 50));
        pl.add(new PremierLeague("Chelsea", 29, 9, 48));
        pl.add(new PremierLeague("Wolverhampton Wanderers", 29, 7, 43));
        pl.add(new PremierLeague("Sheffield United", 28, 5, 43));
        pl.add(new PremierLeague("Manchester United", 28, 12, 42));
        pl.add(new PremierLeague("Tottenham Hotspur", 29, 7, 41));
        pl.add(new PremierLeague("Arsenal", 28, 4, 40));
        pl.add(new PremierLeague("Burnley", 29, -6, 39));
        pl.add(new PremierLeague("Crystal Palace", 29, -6, 39));
        pl.add(new PremierLeague("Everton", 29, -6, 37));
        pl.add(new PremierLeague("Newcastle United", 29, -16, 35));
        pl.add(new PremierLeague("Southampton", 29, -17, 34));
        pl.add(new PremierLeague("Brighton & Hove Albion", 29, -8, 29));
        pl.add(new PremierLeague("West Ham United", 29, -15, 27));
        pl.add(new PremierLeague("Watford", 29, -17, 27));
        pl.add(new PremierLeague("AFC Bournemouth", 29, -18, 27));
        pl.add(new PremierLeague("Aston Villa", 27, -18, 25));
        pl.add(new PremierLeague("Norwich City", 29, -27, 21));

        System.out.println("==== Before sorting ====");
        pl.displayAll();
        System.out.println("==== After sorting ====");
        pl.insertionSort(true);
        pl.displayAll();

    }
}
