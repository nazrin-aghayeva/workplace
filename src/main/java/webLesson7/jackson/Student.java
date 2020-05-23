package webLesson7.jackson;

import java.util.List;

public class Student {
  String name;
  int age;
  String group;
  List<String> responsibilities;

  public Student(String name, int age, String group) {
    this.name = name;
    this.age = age;
    this.group = group;
  }

  public Student() {
  }

  public List<String> getResponsibilities() {
    return responsibilities;
  }

  public void setResponsibilities(List<String> responsibilities) {
    this.responsibilities = responsibilities;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getGroup() {
    return group;
  }

  @Override
  public String toString() {
    return String.format("Student{name='%s', age=%d, group='%s'}", name, age, group);
  }
}
