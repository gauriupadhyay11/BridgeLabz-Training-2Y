package programmingelemennts;

import java.util.Scanner;
public class HandShake {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter the number of students: ");
	        int numberOfStudents = input.nextInt();
	        if (numberOfStudents < 2) {
	            System.out.println("At least 2 students are needed for a handshake.");
	        } else {
	            int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
	            System.out.println("Maximum number of possible handshakes: " + handshakes);
	        }

	        input.close();
	    }
}
