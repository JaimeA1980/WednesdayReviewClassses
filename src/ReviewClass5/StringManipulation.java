package ReviewClass5;

public class StringManipulation {
	public static void main(String[] args) {
		
		String str = "Hello";
		
		System.out.println(str.length());
		
		str=str.toLowerCase();
		System.out.println(str.toLowerCase());
		
		String str2 = str.toUpperCase();
		System.out.println(str2.toUpperCase());
		
		System.out.println(str.equals("hello"));
		System.out.println(str.equalsIgnoreCase("hello"));
		
		System.out.println(str.contains("LL"));
	
		str.toLowerCase().contains("LL".toLowerCase());
		
	boolean result = str.startsWith("H");
	System.out.println(result);
	boolean result2= str.startsWith("ll", 2);
	System.out.println(result2);
	
	String b="ll";
	System.out.println(str.endsWith(b));
	
	String str3 ="";
	System.out.println("Empty: "+str2.isEmpty());
	
	//String str4=str +" "+"World";
	String str4 = str.concat(" ").concat("World ");
	String str5 =str4.trim().concat("buddies");
	System.out.println(str5);
	
	char result3= str.charAt(4);
	System.out.println(result3);

	String newStr = " "+str.charAt(0)+str.charAt(2)+str.charAt(4);
	System.out.println(newStr);
	
	
	String str6="klmhjnpot";
	System.out.println();
	
	
				
		
		
	}

}
