package yuvaraj.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class employee {
	private int empNO;
	private String empname;
	private int empSalary;

	public employee(int empNO, String empname, int empSalary) {
		// TODO Auto-generated constructor stub
		this.empNO = empNO;
		this.empname = empname;
		this.empSalary = empSalary;

	}

	public int getEmpNO() {
		return empNO;
	}

	public String getEmpname() {
		return empname;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	@Override
	public String toString() {
		return "CRUD [empNO=" + empNO + ", empname=" + empname + ", empSalary=" + empSalary + "]";
	}
}

public class CRUD {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int ch;
		List<employee> che = new ArrayList<employee>();
		do {
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.UPDATE");
			System.out.println("5.DELETE");
			System.out.println("ENTER YOUR CHOICE: ");
			ch = s.nextInt();

			// Switch cases for choices

			switch (ch) {
			case 1:
				System.out.println("Enter your EMP No");
				int empNO = s.nextInt();
				System.out.println("Enter your Salary Amount");
				int empSalary = s.nextInt();
				System.out.println("Enter your EMP Name");

				String empName = s.next();

				che.add(new employee(empNO, empName, empSalary));
				break;
			case 2:
				boolean found = false;
				System.out.println("-----------------------");
				Iterator<employee> i = che.iterator();
				while (i.hasNext()) {
					employee e = i.next();
					System.out.println(e);
					found = true;
				}
				if (!found) {
					System.out.println("Record Not Found");
				}
				System.out.println("-----------------------");
				break;
			case 3:
				found = false;
				System.out.println("-----------------------");
				System.out.println("Enter the EMP No to Search");
				int emno = s.nextInt();
				i = che.iterator();
				while (i.hasNext()) {
					employee e = i.next();
					if (e.getEmpNO() == emno) {
						System.out.println(e);
						found = true;
					}
					if (!found) {
						System.out.println("Record Not Found");
					}

				}
				System.out.println("-----------------------");
				break;

			case 4:
				found = false;
				System.out.println("-----------------------");
				System.out.println("Enter the EMP No to Update");
				emno = s.nextInt();
				ListIterator<employee> li = che.listIterator();

				while (li.hasNext()) {
					employee e = li.next();
					if (e.getEmpNO() == emno) {
						System.out.println("Enter the New Employee Salary: ");
						empSalary = s.nextInt();
						System.out.println("Enter the New Employee name: ");
						empName = s.next();

						li.set(new employee(emno, empName, empSalary));
						found = true;

					}
				}
				if (!found) {
					System.out.println("Record Not Found");
				} else
					System.out.println("Record Updated Successfully");

				break;
			case 5:

				found = false;
				System.out.println("Enter the EMP No to Delete");
				emno = s.nextInt();
				i = che.iterator();
				while (i.hasNext()) {
					employee e = i.next();
					if (e.getEmpNO() == emno) {
						i.remove();
found=true;
					}
					if (!found) {
						System.out.println("Record Not Found");
					} else
						System.out.println("Record Deleted Successfully");

				}
				System.out.println("-----------------------");
				break;

			}

		} while (ch != 0);

	}

}
