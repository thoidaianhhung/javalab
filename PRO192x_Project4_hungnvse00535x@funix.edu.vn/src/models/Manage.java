package models;

import java.util.Scanner;

// Definition for the management class, will inherit from Employee class
public class Manage extends Employee {
  static Scanner input = new Scanner(System.in);
  private String title;

  // Constructor Declaration of Class
  public Manage(String employeeId, String employeeName, int employeeAge, String workday, String departmentName,
      String title, int vocationDays, int salary) {
    super(employeeId, employeeName, employeeAge, workday, departmentName, vocationDays, salary);
    // TODO Auto-generated constructor stub
    this.setTitle(title);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  // The toString() method to specify how the information fields will be
  // displayed.
  public String toString() {
    return String.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20d%-20d", getEmployeeId(), getDepartmentName(),
        getEmployeeAge(), getWorkday(), getDepartmentName(), title, getVocationDays(), getSalary());

  }
  
  // Change employee from one department to another.
  public void transferEmployee(Employee employee) {
    // TODO Auto-generated method stub
    int choice = 0;
    while (true) {
      try {
        choice = Integer.parseInt(input.nextLine());
        if (choice >= 1 && choice <= 3) {
          break;
        }
        System.out.print("Department Name (1 = Kế Toán, 2 = Kinh Doanh, 3 = Nhân Sự) ");
      } catch (NumberFormatException e) {
        System.out.println("NumberFormatException");
        System.out.print("Department Name (1 = Kế Toán, 2 = Kinh Doanh, 3 = Nhân Sự) ");
      }
    }
    switch (choice) {
    case 1:
      employee.setDepartmentName("Kế Toán");
      break;
    case 2:
      employee.setDepartmentName("Kinh Doanh");
      break;
    case 3:
      employee.setDepartmentName("Nhân Sự");
      break;
    }
  }
  
  // Change the salary of the employee
  public void changeSalary(Employee employee) {
    int x = 0;
    System.out.println("Enter employee Salary to change:");
    while (input.hasNext()) {
      if (input.hasNextInt()) {
        x = Integer.parseInt(input.nextLine());
        break;
      } else {
        System.out.println("Enter employee Salary to change:");
        input.nextLine();
      }
    }
    employee.setSalary(x);
  }
}
