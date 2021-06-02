package stringoperations;

public class StringOperations {
	public static void main(String[] args){
		String string1 = "Hello";
		String string2 = "Lisa";
		String string3 = ""; // Empty string or null
		string3 = "How are you".concat(string2);
		System.out.println("string3: " + string3); // get length
		System.out.println("Length: " + string1.length()); 
		// get substring begining with character 0, up to, but not
		// including character 5
		System.out.println("Sub: " + string3.substring(0,5));
		// Uppercase
		System.out.println("Upper: " + string3.toUpperCase());
		
		String string4 = "How are you " + string2;
		System.out.println("string4 : " + string4);
		System.out.println("string : " + (string1 += string2));
		System.out.println(string2.indexOf('a'));
		System.out.println(string2.charAt(2));
		
		String s1 = "abc";
		String s2 = "cde";
		System.out.println(s1.compareTo(s2));
		
		s1 = "abc";
		s2 = "ABC";
		System.out.println(s1.equals(s2));
	}
}
