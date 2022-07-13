package yuvaraj.practice.StudentDatabaseAPP;

import java.util.Scanner;

public class StudentDatabaseAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		;

		System.out.println("Enter No Of Students");
		Scanner nu = new Scanner(System.in);
		int size = nu.nextInt();
		Student[] students = new Student[size];
		for (int n = 0; n < size; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].Payment();
		}
		for (int n = 0; n < size; n++) {

			System.out.println(students[n].showInfo());
			System.out.println();
		}
	}

}
