package JavaString;

import java.util.Scanner;

public class SubString {
	    static String customSubstring(String s, int start, int end) {
	        String sub = "";
	        for (int i = start; i < end && i < s.length(); i++)
	            sub += s.charAt(i);
	        return sub;
	    }

	    static boolean compare(String a, String b) {
	        if (a.length() != b.length()) return false;
	        for (int i = 0; i < a.length(); i++)
	            if (a.charAt(i) != b.charAt(i)) return false;
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the text: ");
	        String text = sc.next();
	        System.out.print("Enter start index: ");
	        int start = sc.nextInt();
	        System.out.print("Enter end index: ");
	        int end = sc.nextInt();
	        
	        String sub1 = customSubstring(text, start, end);
	        String sub2 = text.substring(start, Math.min(end, text.length()));

	        System.out.println("Custom: " + sub1);
	        System.out.println("Built-in: " + sub2);
	        System.out.println("Equal? " + compare(sub1, sub2));
	        sc.close();
	    }
}
