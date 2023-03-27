package jobsheetSorting;

public class PremierLeagueService {
    PremierLeague list[] = new PremierLeague[20];
    int index;

    // add method
    void add(PremierLeague team) {
        if (index < list.length) {
            list[index] = team;
            index++;
        } else {
            System.out.println("The list is already full-filled");
        }
    }
    // display method
    void displayAll() {
        for (PremierLeague team : list) {
            System.out.printf("%-30s %-3s %-4s %-3s\n", team.team, team.play, team.goal, team.points);
        }
    }
    //insertion sort
    void insertionSort(boolean asc) {
        for (int i = 1; i < list.length; i++) {
            PremierLeague key = list[i];
            int j = i - 1;
            if (asc) {
                while ((j >= 0) && (Integer.parseInt(list[j].points) > Integer.parseInt(key.points))) {
                    list[j + 1] = list[j];
                    j--;
                }
            } else {
                while ((j >= 0) && (Integer.parseInt(list[j].points) < Integer.parseInt(key.points))) {
                    list[j + 1] = list[j];
                    j--;
                }
            }
            list[j + 1] = key;
        }
    }

}
