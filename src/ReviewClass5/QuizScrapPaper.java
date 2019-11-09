package ReviewClass5;

public class QuizScrapPaper {

	public static void main(String[] args) {
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
	    
	    int totalEl = 0;
			
			for(int[] row :a) {
				for(int el:row) {
					if (el<0 && !(el%2==0)) {
						totalEl++;
					}
					
				}
				
			}
			System.out.println(totalEl);
    

		

		

	}

}
