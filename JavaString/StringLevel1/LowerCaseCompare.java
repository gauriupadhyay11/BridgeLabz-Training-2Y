package JavaString;
import java.util.Scanner;
public class LowerCaseCompare {
	    public static String convertToLower(String input) {
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (ch >= 'A' && ch <= 'Z') {
	                ch = (char)(ch + 32);
	            }
	            result.append(ch);
	        }

	        return result.toString();
	    }
	    public static boolean compareStrings(String str1, String str2) {
	        if (str1.length() != str2.length()) {
	            return false;
	        }
	        for (int i = 0; i < str1.length(); i++) {
	            if (str1.charAt(i) != str2.charAt(i)) {
	                return false;
	            }
	        }

	        return true;
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a line of text:");
	        String originalText = scanner.nextLine();

	        String builtInLower = originalText.toLowerCase();

	        String customLower = convertToLower(originalText);

	        boolean isSame = compareStrings(builtInLower, customLower);

	        System.out.println("\nBuilt-in lowercase:  " + builtInLower);
	        System.out.println("Custom lowercase:    " + customLower);
	        System.out.println("Are both same?       " + isSame);
	    }
}
