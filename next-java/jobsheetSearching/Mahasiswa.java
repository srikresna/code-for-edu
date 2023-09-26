package jobsheetSearching;

public class Mahasiswa{
    String[][] data = {
        {"Alfi", "Safira", "Tiara", "Arif", "Erdi"},
        {"Yudha", "Nisa", "Yulia", "Fauzan", "Dwi"},
        {"Dewa", "Ana", "Abdul", "Dani", "Ammar"}
    };
    
    public void printArray(){
        System.out.println("Daftar Kelompok Mahasiswa");
        for (int row = 0; row < data.length; row++) {
            System.out.println("Kelompok " + (row+1) + ":");
            for (int col = 0; col < data[row].length; col++) {
                System.out.print(data[row][col] + " ");
            }
            System.out.println("");
        }
    }

    public int[] usingSequentialSearch(String search){
        int[] position = new int[2];
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                if (data[row][col].equals(search)) {
                    position[0] = row;
                    position[1] = col;
                    return position;
                } else {
                    position[0] = -1;
                    position[1] = -1;
                }
            }
        }
        return position;
    }
}
