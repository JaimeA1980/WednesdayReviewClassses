package ReviewClass6;

public class Two_D_Array_ForEach {

	public static void main(String[] args) {
		
		int [][] intArray = { 
				{2,3,4},
				{4,5,6},
				{6,7,8},
				{8,9,0}
		
		};
		
		for (int row =0; row < intArray.length; row++) {
			for (int col = 0; col < intArray[row].length; col++) {
				System.out.print(intArray[row][col] + " ");		
			}
			System.out.println();
		}
		
		System.out.println("Using advanced for loop");
		for (int[] row : intArray) {
			for (int element:row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

}
