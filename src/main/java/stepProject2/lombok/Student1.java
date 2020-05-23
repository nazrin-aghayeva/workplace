package stepProject2.lombok;

@MyCoolAnnotation
public class Student1 {

  @MyCoolAnnotation
  private int id;
  private String name;
  private int group;

  @MyCoolAnnotation
  public Student1() {
  }

  public Student1(@MyCoolAnnotation int id, String name, int group) {
    this.id = id;
    this.name = name;
    this.group = group;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGroup() {
    return group;
  }

  public void setGroup(int group) {
    this.group = group;
  }

  @Override
  public String toString() {
    return "Student{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", group=" + group +
        '}';
  }
}
