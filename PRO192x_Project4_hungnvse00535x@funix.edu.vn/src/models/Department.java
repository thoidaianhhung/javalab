package models;

// Definitions for department classes
public class Department {
  private String departmentId;
  private String departmentName;
  private int departmentNumber;

  // Constructor Declaration of Class
  public Department(String departmentId, String departmentName, int departmentNumber) {
    this.departmentId = departmentId;
    this.departmentName = departmentName;
    this.departmentNumber = departmentNumber;
  }

  public String getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public int getDepartmentNumber() {
    return departmentNumber;
  }

  public void setDepartmentNumber(int departmentNumber) {
    this.departmentNumber = departmentNumber;
  }
  
  public void update(String id, String name, int number) {
    if (id != null && !"".equalsIgnoreCase(id)) {
      this.departmentId = id;
    }
    if (name != null && !"".equalsIgnoreCase(name)) {
      this.departmentName = name;
    }
    this.departmentNumber = number;
  }
  // The toString() method to specify how the information fields will be
  // displayed.
  public String toString() {
    return String.format("%-20s%-20s%-20d", departmentId, departmentName, departmentNumber);
  }
}
