package JavaString;

import java.util.Scanner;

public class Character {
	    static char[] customToCharArray(String str) {
	        char[] arr = new char[str.length()];
	        for (int i = 0; i < str.length(); i++)
	            arr[i] = str.charAt(i);
	        return arr;
	    }

	    static boolean compareCharArrays(char[] a, char[] b) {
	        if (a.length != b.length) return false;
	        for (int i = 0; i < a.length; i++)
	            if (a[i] != b[i]) return false;
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String input = sc.next();

	        char[] custom = customToCharArray(input);
	        char[] builtin = input.toCharArray();

	        System.out.println("Custom array: " + String.valueOf(custom));
	        System.out.println("Built-in array: " + String.valueOf(builtin));
	        System.out.println("Arrays equal? " + compareCharArrays(custom, builtin));

	        sc.close();
	    }
}
