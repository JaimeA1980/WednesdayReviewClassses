package ReviewClass5;

public class Sum2DArray {

	public static void main(String[] args) {
		
		int[][] b = { { 2, 3, 5 }, { 2, 4, 7 }, { 8, 1, 9 }, { 3, 5, 1 } };
        int sum = 0;
        
        for (int i = 0; i < b.length; i++) {
            for (int k = 0; k < b[i].length; k++) {
                sum += b[i][k];
            }
        }
        sum = 0;
        int row= 2;
        for (int k =0; k<b[row].length;k++) {
        	sum+=b[row][k];
        }
        
        System.out.println("sum in row " +row+" is "+ sum);

        /*Homework
         * Create a 1-D array
         * enter the sum of each row into
         * one element of the array
         * **EXTRA**
         * Create a 1-D array
         * Enter the sum of each column
         * int one element of the array
         */

	}

}
