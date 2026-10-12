package com.controller;

import java.util.Scanner;

import com.POJO.Student;
import com.Service.StudentService;

public class StudentController {

	public static void main(String args[]) {

		StudentService ss = new StudentService();
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("\n1. Insert");
			System.out.println("2. Delete");
			System.out.println("3. Update");
			System.out.println("4. Show");
			System.out.println("5. Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:
				System.out.println("Enter id");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter name");
				String name = sc.nextLine();

				System.out.println("Enter city");
				String city = sc.nextLine();

				System.out.println("Enter age");
				int age = sc.nextInt();
				sc.nextLine();

				Student s1 = new Student(id, name, city, age);
				ss.addStudent(s1);
				break;

			case 2:
				System.out.println("Enter id you want to delete");
				int idd = sc.nextInt();
				sc.nextLine();

				Student s2 = new Student();
				s2.setId(idd);
				ss.deleteStudnt(s2);
				break;

			case 3:
				System.out.println("Enter id you want to update");
				int uid = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter new name");
				String uname = sc.nextLine();

				System.out.println("Enter new city");
				String ucity = sc.nextLine();

				System.out.println("Enter new age");
				int uage = sc.nextInt();
				sc.nextLine();

				Student s3 = new Student(uid, uname, ucity, uage);
				ss.updateStudent(s3);
				break;

			case 4:
				System.out.println("Enter id you want to show");
				int sid = sc.nextInt();
				sc.nextLine();

				Student s4 = new Student();
				s4.setId(sid);
				ss.showstudent(s4);
				break;

			case 5:
				System.out.println("Exit");
				sc.close();
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice");
			}
		}
	}
}