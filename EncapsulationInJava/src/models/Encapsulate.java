package models;

public class Encapsulate {
  private String name;
  private int age;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    if (age > 20) {
      this.age = age;
    }
  }
  public Encapsulate(String name, int age) {
    // TODO Auto-generated constructor stub
    this.setName(name);
    this.setAge(age);
  }
}
