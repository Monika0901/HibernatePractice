
package com.controller;

import java.util.Scanner;
import com.POJO.Students;
import com.Service.StudentService;

public class StudentController {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Insert Data");
        System.out.println("2. Update Data");
        System.out.println("3. Delete Data");
        System.out.println("4. Get Single Result");
        System.out.println("5. Fetch All Data");
        System.out.println("Enter your choice:");

        int choice = sc.nextInt();

        switch (choice) {

        case 1:
            // Insert data
            sc.nextLine();

            System.out.println("Enter id");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter name");
            String name = sc.nextLine();

            System.out.println("Enter city");
            String city = sc.nextLine();

            System.out.println("Enter age");
            int age = sc.nextInt();

            Students s = new Students(id, name, city, age);
            StudentService ss1 = new StudentService();
            ss1.insertData(s);

            System.out.println("Student inserted Successfully!");
            break;

        case 2:
            // Updated data
            StudentService ss2 = new StudentService();
            Students std2 = new Students();

            System.out.println("Enter Student ID:");
            std2.setId(sc.nextInt());
            sc.nextLine();

            System.out.println("Enter Student Name:");
            std2.setName(sc.nextLine());

            System.out.println("Enter Student City:");
            std2.setCity(sc.nextLine());

            ss2.updateData(std2);

            System.out.println("Student Updated Successfully!");
            break;

        case 3:
            // Delete data
            StudentService ss3 = new StudentService();
            Students std3 = new Students();

            System.out.println("Enter Student ID:");
            std3.setId(sc.nextInt());

            ss3.deleteData(std3);

            System.out.println("Student delete data Successfully!");
            break;

        case 4:
            // Get Single Result
            StudentService ss4 = new StudentService();
            Students std4 = new Students();

            System.out.println("Enter Student ID:");
            std4.setId(sc.nextInt());

            ss4.GetSingleResult(std4);

            System.out.println("fetch data Successfully!");
            break;

        case 5:
            // Fetch All Data
            StudentService ss5 = new StudentService();
            Students std5 = new Students();

            ss5.FetchAllData(std5);

            System.out.println("fetch All data Successfully!");
            break;

        default:
            System.out.println("Invalid choice!");
            break;
        }

        sc.close();
    }
}
