package Que_q17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C_LowestSalary {
	public static void main(String[] args) {
		List<Employee> slist = new ArrayList<Employee>();
		slist.add(new Employee("Nikhil", LocalDate.of(1997, 11, 17), LocalDate.of(2011, 03, 21),
				LocalDate.of(2020, 2, 21), "Pune", "Devoloper", 40000));
		slist.add(new Employee("Mayur", LocalDate.of(1995, 4, 12), LocalDate.of(2012, 05, 1), LocalDate.of(2019, 6, 1),
				"Mumbai", "H.r", 20000));
		slist.add(new Employee("Ashish", LocalDate.of(2002, 1, 27), LocalDate.of(2011, 07, 31),
				LocalDate.of(2016, 7, 13), "Nagpur", "Account", 35000));
		slist.add(new Employee("Dipesh", LocalDate.of(1994, 7, 8), LocalDate.of(2010, 03, 17),
				LocalDate.of(2022, 9, 25), "Banglore", "Mentainance", 11000));
		slist.add(new Employee("Raman", LocalDate.of(1992, 11, 17), LocalDate.of(2015, 02, 11),
				LocalDate.of(2020, 2, 11), "Pune", "Devoloper", 39000));
		slist.add(new Employee("Aman", LocalDate.of(1991, 4, 12), LocalDate.of(2013, 8, 14), LocalDate.of(2019, 8, 5),
				"Delhi", "H.r", 28000));
		slist.add(new Employee("Arjun", LocalDate.of(1990, 1, 27), LocalDate.of(2014, 11, 12),
				LocalDate.of(2016, 9, 23), "Indore", "Account", 45000));
		slist.add(new Employee("manoj", LocalDate.of(2001, 7, 8), LocalDate.of(2011, 10, 14), LocalDate.of(2022, 10, 5),
				"Hydrabad", "Mentainance", 21000));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter department");
		String a = sc.next();
		Employee e4 = slist.stream().filter(e -> e.dept.equals(a)).max((e1, e2) -> e1.salary < e2.salary ? 1 : -1)
				.get();
		System.out.println(e4.getEname() + " ," + e4.dob + ", " + e4.getDoj() + " ," + e4.doresign + " ,"
				+ e4.getLocation() + " ," + e4.getDept() + " ," + e4.getSalary());
	}
}
