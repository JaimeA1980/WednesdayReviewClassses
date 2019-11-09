package ReviewClass6;

public class ReviewSheer {
	public static void main (String[] args) {
		
		String longStr ="I Am very happy today, because today is not Monday";
		String anotherStr = longStr.replace('a', 'e').replace('A','3');
		
		System.out.println(anotherStr);
		
		System.out.println("=================================================================================================================================================================");
		
		
		anotherStr = longStr.replace("today", "tomorrow");
		System.out.println(anotherStr);
		
		anotherStr = longStr.replace(",","");
		System.out.println(anotherStr);
		
		anotherStr = longStr.replaceAll("a", "e");
		System.out.println(anotherStr);
		
		longStr="!][{}!@!{}[]";
		anotherStr=longStr.replaceAll("[a-zA-Z ,.]", "1");
		System.out.println(anotherStr);
		
		longStr = "I want to learn Java. And I want to learn more. Is this ok?";
		anotherStr = longStr.replaceAll("[^a-zA-Z]", "+");
		System.out.println(longStr);
		System.out.println(anotherStr);
		
		System.out.println("=================================================================================================================================================================");
		
		
		
		
		
		
	}

}
