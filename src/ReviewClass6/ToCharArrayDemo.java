package ReviewClass6;

public class ToCharArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String longStr = "I am very happy today, because today is not Monday.";
		char[] charArray = longStr.toCharArray();
		System.out.println(longStr.length());
		System.out.println(charArray.length);

		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		System.out.println();

		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
		
		System.out.println();
		for (char element: charArray) {
			System.out.print(element);
		}
		System.out.println("\n ================================================================================================");
		
		String anotherStr = "";
		anotherStr += 'A';
		System.out.println(anotherStr);
		
		System.out.println("================================================================================================================================================================");
		
		for (char element : charArray) {
			if (element =='a') {
				anotherStr += 'e';
			}else {
				anotherStr += element;
			}
		}
		System.out.println(anotherStr);
		System.out.println("=================================================================================================================================================================");
		
		
	}

}
