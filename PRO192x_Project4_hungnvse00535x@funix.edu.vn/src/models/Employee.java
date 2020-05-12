package models;

// Definition for employee class
public class Employee {
  private String employeeId;
  private String employeeName;
  private int employeeAge;
  private String workday;
  private String departmentName;
  private int vocationDays;
  private int salary;
  
  // Constructor Declaration of Class
  public Employee(String employeeId, String employeeName, int employeeAge, 
      String workday, String departmentName, int vocationDays, int salary) {
    this.employeeId = employeeId;
    this.employeeName = employeeName;
    this.employeeAge = employeeAge;
    this.workday = workday;
    this.departmentName = departmentName;
    this.vocationDays = vocationDays;
    this.salary = salary;
  }
  
  public String getEmployeeId() {
    return employeeId;
  }
  
  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }
  
  public String getEmployeeName() {
    return employeeName;
  }
  
  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }
  
  public int getEmployeeAge() {
    return employeeAge;
  }
  
  public void setEmployeeAge(int employeeAge) {
    this.employeeAge = employeeAge;
  }
  
  public String getWorkday() {
    return workday;
  }
  
  public void setWorkday(String workday) {
    this.workday = workday;
  }
  
  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  } 
  
  public int getVocationDays() {
    return vocationDays;
  }
  
  public void setVocationDays(int vocationDays) {
    this.vocationDays = vocationDays;
  }
  
  public int getSalary() {
    return salary;
  }
  
  public void setSalary(int salary) {
    this.salary = salary;
  }
  public void update(String id,String name, int age, String workday) {
    if (id != null && !"".equalsIgnoreCase(id)) {
      this.employeeId = id;
    }
    if(name != null && !"".equalsIgnoreCase(name)) {
      this.employeeName = name;  
    }
    this.employeeAge = age;
    this.workday = workday;
  }
  
  @Override
  // The toString() method to specify how the information fields will be
  // displayed.
  public String toString() {
    return String.format("%-20s%-20s%-20s%-20s%-20s%-20d%-20d", employeeId, 
        employeeName, employeeAge, workday, departmentName, vocationDays, salary);
  }
}
