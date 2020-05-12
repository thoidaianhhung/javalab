package Main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import models.Department;
import models.Employee;
import models.Manage;

// The HumanResoucres file is the class that contains the main stream of the program
public class HumanResoucres {
  static List<Employee> myEmployee = new ArrayList<Employee>();
  static List<Department> myDepartment = new ArrayList<Department>();
  static List<Manage> myManage = new ArrayList<Manage>();
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    myManage.add(new Manage("SE001", "Diệp Ứng Long", 40, "24/6/2010", "Nhân Sự", "Trưởng Phòng", 4, 100000));
    myEmployee.add(new Employee("SE001", "Diệp Ứng Long", 40, "24/6/2010", "Nhân Sự", 4, 100000));

    System.out.println("Welcome to the human resource management application.");
    System.out.println();
    while (true) {
      System.out.println("----------------------------------------------------------------------------");
      System.out.println("1. Displays a list of employees currently in the company");
      System.out.println("2. Displays departments in the company");
      System.out.println("3. Displays employees by department");
      System.out.println("4. Add new employees to the company");
      System.out.println("5. Managers are allowed to transfer employees from one department to another");
      System.out.println("6. The manager is allowed to change the salary of the employee");
      System.out.println("7. Search employee information by name or employee code");
      System.out.println("8. Display salary of the entire company");
      System.out.println("9. Display employee salary in ascending order");
      System.out.println("10. Exit");
      System.out.print("Your choice: ");
      int choice = 0;
      // Check input choice variable.
      while (true) {
        try {
          choice = Integer.parseInt(input.nextLine());
          if (choice >= 1 && choice <= 12) {
            break;
          }
          System.out.println("Choice from 1 to 12.");
          System.out.print("Your choice: ");
        } catch (NumberFormatException e) {
          System.out.println(e);
          System.out.print("Your choice: ");
        }
      }
      switch (choice) {
      case 1:
        display();
        break;
      case 2:
        displayDepartment();
        break;
      case 3:
        displayListForDepartment();
        break;
      case 4:
        add();
        break;
      case 5:
        employeeTransfer();
        break;
      case 6:
        salaryChange();
        break;
      case 7:
        search();
        break;
      case 8:
        orderOfDecreasing();
        break;
      case 9:
        orderOfAscending();
        break;
      case 10:
        System.out.println("Good bye.");
        System.exit(0);
        break;
      }
    }
  }

  // Add new employees to the company
  public static void add() {
    System.out.println("Enter information for the new employee:");
    System.out.print("Employee Id: ");
    String employeeId = input.nextLine();
    while (employeeId.isEmpty()) {
      System.out.print("Employee Id: ");
      employeeId = input.nextLine();
    }
    System.out.print("Employee Name: ");
    String employeeName = input.nextLine();
    while (employeeName.isEmpty()) {
      System.out.print("Employee Name: ");
      employeeName = input.nextLine();
    }
    System.out.print("Employee Age: ");
    int employeeAge;
    while (true) {
      try {
        employeeAge =  Integer.parseInt(input.nextLine());
        break;
      } catch (NumberFormatException e) {
        System.out.println(e);
        System.out.print("Employee Age: ");
      }
    }
    System.out.print("Workday (dd/mm/yyyy): ");
    String workday = null;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
    while (true) {
      try {
        workday = input.nextLine();
        formatter.parse(workday);
        break;
      } catch (Exception e) {
        System.out.println(e);
        System.out.print("Workday: ");
      }
    }
    System.out.print("Department Name (1 = Kế Toán, 2 = Kinh Doanh, 3 = Nhân Sự) ");
    int choice = 0;
    while (true) {
      try {
        choice = Integer.parseInt(input.nextLine());
        if (choice >= 1 && choice <= 3) {
          break;
        }
        System.out.println("Department name from 1 to 3");
        System.out.print("Department Name (1 = Kế Toán, 2 = Kinh Doanh, 3 = Nhân Sự) ");
      } catch (NumberFormatException e) {
        System.out.println("NumberFormatException");
        System.out.print("Department Name (1 = Kế Toán, 2 = Kinh Doanh, 3 = Nhân Sự) ");
      }
    }
    String departmentName = "Kế Toán";
    switch (choice) {
    case 1:
      departmentName = "Kế Toán";
      break;
    case 2:
      departmentName = "Kinh Doanh";
      break;
    case 3:
      departmentName = "Nhân Sự";
      break;
    }
    System.out.print("Vocation Days: ");
    int vocationDays = 0;
    while (true) {
      try {
        vocationDays = Integer.parseInt(input.nextLine());
        break;
      } catch (NumberFormatException e) {
        System.out.println("NumberFormatException");
        System.out.print("Vocation Days: ");
      }
    }

    System.out.print("Salary ");
    int salary = 0;
    while (true) {
      try {
        salary = Integer.parseInt(input.nextLine());
        break;
      } catch (NumberFormatException e) {
        System.out.println("NumberFormatException");
        System.out.print("Salary ");
      }
    }
    addToList(employeeId.toUpperCase(), employeeName, employeeAge, workday, departmentName, vocationDays, salary);
    System.out.println("A new Employee has been added.");
  }

  // add to list.
  public static void addToList(String employeeId, String employeeName, int employeeAge, String workday,
      String departmentName, int vocationDays, int salary) {
    Employee employee = new Employee(employeeId.toUpperCase(), employeeName, employeeAge, workday, departmentName,
        vocationDays, salary);
    myEmployee.add(employee);
  }

  // Displays a list of employees currently in the company
  public static void display() {
    System.out.println(String.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s", "Employee Id", "Employee Name",
        "Employee Age", "Workday", "Department Name", "Vocation Days", "Salary"));
    for (Employee employee : myEmployee) {
      System.out.println(employee.toString());
    }
  }

  // Search employee information by name or employee code
  public static void search() {
    Set<Employee> employeeFound = new HashSet<>();
    System.out.println("Enter employee Name to search.");
    System.out.print("Employee Name: ");
    String searchKey = input.nextLine().toLowerCase();
    for (Employee employee : myEmployee) {
      if (employee.getEmployeeName().toLowerCase().contains(searchKey)) {
        employeeFound.add(employee);
      }
    }
    if (employeeFound.isEmpty()) {
      System.out.println("The employee is not in the company.");
    } else {
      System.out.println(String.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s", "Employee Id", "Employee Name",
          "Employee Age", "Workday", "Department Name", "Vocation Days", "Salary"));
      for (Employee employee : employeeFound) {
        System.out.println(employee.toString());
      }
    }
  }

  // Displays departments in the company
  public static void displayDepartment() {
    int accountantList = 0;
    int businessList = 0;
    int personnelList = 0;
    for (Employee employee : myEmployee) {
      if (employee.getDepartmentName().equals("Kế Toán")) {
        accountantList++;
      }
      if (employee.getDepartmentName().equals("Kinh Doanh")) {
        businessList++;
      }
      if (employee.getDepartmentName().equals("Nhân Sự")) {
        personnelList++;
      }
    }
    myDepartment.add(new Department("KT", "Kế Toán", accountantList));
    myDepartment.add(new Department("KD", "Kinh Doanh", businessList));
    myDepartment.add(new Department("NS", "Nhân Sự", personnelList));
    System.out.println(String.format("%-20s%-20s%-20s", "departmentId", "departmentName", "departmentNumber"));
    for (Department department : myDepartment) {
      System.out.println(department.toString());
    }
  }

  // Displays employees by department
  public static void displayListForDepartment() {
    
    Collections.sort(myEmployee, new Comparator<Employee>() {

      @Override
      public int compare(Employee o1, Employee o2) {
        // TODO Auto-generated method stub
        return o1.getDepartmentName().compareTo(o2.getDepartmentName());
      }
    });
    display();
  }

  // Display salary of the entire company
  public static void orderOfDecreasing() {
    Collections.sort(myEmployee, new Comparator<Employee>() {

      @Override
      public int compare(Employee o1, Employee o2) {
        // TODO Auto-generated method stub
        return o2.getSalary() - o1.getSalary();
      }
    });
    display();
  }

  // Display employee salary in ascending order
  public static void orderOfAscending() {
    Collections.sort(myEmployee, new Comparator<Employee>() {

      @Override
      public int compare(Employee o1, Employee o2) {
        // TODO Auto-generated method stub
        return o1.getSalary() - o2.getSalary();
      }
    });
    display();
  }

  // Managers are allowed to transfer employees from one department to another
  public static void employeeTransfer() {
    System.out.print("Enter manage ID to transfer: ");
    String searchKey = input.nextLine();
    for (Manage manage : myManage) {
      if (manage.getEmployeeId().equalsIgnoreCase(searchKey)) {
        System.out.println("It is true that the manager and has the right to correct");
        System.out.print("Enter employee ID to transfer: ");
        String searchKey1 = input.nextLine();
        for (Employee employee : myEmployee) {
          if (employee.getEmployeeId().equalsIgnoreCase(searchKey1)) {
            System.out.print("Department Name (1 = Kế Toán, 2 = Kinh Doanh, 3 = Nhân Sự) ");
            ((Manage) manage).transferEmployee(employee);
            display();
            return;
          }
        }
      }
      System.out.println("Enter false.");
    }
  }
  
  // The manager is allowed to change the salary of the employee
  public static void salaryChange() {
    System.out.print("Enter manage ID to change: ");
    String searchKey = input.nextLine();
    for (Manage manage : myManage) {
      if (manage.getEmployeeId().equalsIgnoreCase(searchKey)) {
        System.out.println("It is true that the manager and has the right to correct");
        System.out.print("Enter employee ID to change: ");
        String searchKey1 = input.nextLine();
        for (Employee employee : myEmployee) {
          if (employee.getEmployeeId().equalsIgnoreCase(searchKey1)) {
            ((Manage) manage).changeSalary(employee);
            display();
            return;
          }
        }
      }
      System.out.println("Enter false.");
    }
  }
}
