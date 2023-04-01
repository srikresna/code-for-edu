package jobsheetSearching;

public class Array2D {
    int[][] data = {
        {45,78,7,200,80},
        {90,1,17,100,50},
        {21,2,40,18,65}
    };
    
    public void printArray(){
        System.out.println("Index \t 0 \t 1 \t 2 \t 3 \t 4");
        for (int row = 0; row < data.length; row++) {
            System.out.print(row + " \t ");
            for (int col = 0; col < data[row].length; col++) {
                System.out.print(data[row][col] + " \t ");
            }
            System.out.println("");
        }
    }

    public int[] usingSequentialSearch(int search){
        int[] position = new int[2];
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                if (data[row][col] == search) {
                    position[0] = row;
                    position[1] = col;
                    return position;
                }
            }
        }
        return position;
    }
}
