import java.util.Scanner;

public class StudentsTranscript {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		int students = input.nextInt();

		int[] grades = new int[students];
		String[] letterGrade = new String[] { "A", "B", "C", "D", "F" };
		int total = 0;
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int F = 0;

		for (int i = 0; i < grades.length; i++) {
			System.out.print((i + 1) + ". student's grade is: ");
			grades[i] = input.nextInt();
			total += grades[i];

			if (grades[i] >= 90 && grades[i] <= 100) {
				A = A + 1;
			} else if (grades[i] >= 80 && grades[i] <= 90) {
				B = B + 1;
			} else if (grades[i] >= 70 && grades[i] <= 80) {
				C = C + 1;
			} else if (grades[i] >= 60 && grades[i] <= 70) {
				D = D + 1;
			} else if (grades[i] < 60) {
				F = F + 1;
			}
		}

		if (A > 0) {
			System.out.println(+ A + "student receive " + letterGrade[0]);
		} else if (A == 0) {
			System.out.println("None of the students receive A");
		}
		if (B > 0) {
			System.out.println(+ B + "student receive " + letterGrade[1]);
		} else if (B == 0) {
			System.out.println("None of the students receive B");
		}
		if (C > 0) {
			System.out.println(+ C + "student receive " + letterGrade[2]);
		} else if (C == 0) {
			System.out.println("None of the students receive C");
		}
		if (D > 0) {
			System.out.println(+ D + "student receive " + letterGrade[3]);
		} else if (D == 0) {
			System.out.println("None of the students receive D");
		}
		if (F > 0) {
			System.out.println(+ F + "student receive " + letterGrade[4]);
		} else if (F == 0) {
			System.out.println("None of the students receive F");
		}
     
		System.out.println("Average grade of students: " + total / grades.length);
	}

}