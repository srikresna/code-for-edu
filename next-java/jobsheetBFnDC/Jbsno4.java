/** 
A university in Malang is holding a vote to elect the BEM chairman in 2020. If the number of
votes collected is always even. Then by inputting the selected candidates, count the number of
votes for each candidate. Make class diagrams and programs using the Divide and Conquer
algorithm from the case study! (The number of array elements and the results of the vote are
user input)
Example: Voting results are as follows (m is majority, nm is not majority)
**/
package jobsheetBFnDC;

public class Jbsno4 {
    
    public int elemen;
    public String name[];

    public Jbsno4(int element) {
        elemen = element;
        name = new String[elemen];
    }

    public String totalDC(String[] name, int left, int right) {
        int mid;
        String hasil = "";
        if (left == right) {
            hasil = name[left];
        } else {
            mid = (left + right) / 2;
            String hasil1 = totalDC(name, left, mid);
            String hasil2 = totalDC(name, mid + 1, right);
            hasil = hasil1 + hasil2;
        }
        return hasil;
    }

    //method print satu calon suara terbanyak
    public String getWinner() {
        String winner = "";
        int max = 0;
        for (int i = 0; i < elemen; i++) {
            int count = 0;
            for (int j = 0; j < elemen; j++) {
                if (name[i].equals(name[j])) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                winner = name[i];
            }
        }
        return winner;
    }


}
