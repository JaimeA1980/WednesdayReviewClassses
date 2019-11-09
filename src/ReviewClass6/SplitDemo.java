package ReviewClass6;

public class SplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String longStr = "I am very happy today, because today is not Monday.";
		
		String[] stringArray = longStr.split("today");
		System.out.println(stringArray.length);
		
		for (int i = 0; i<stringArray.length; i++) {
			if (i==stringArray.length-1) {
				System.out.println(stringArray[i]);
			} else {
			System.out.print(stringArray[i]+"today");
		}
		System.out.println();
		System.out.println("=================================================FOR EACH==========================================================");
		
		for (String str: stringArray) {
			
			System.out.print(str);
		}
		
		
		
		}
		}

}
