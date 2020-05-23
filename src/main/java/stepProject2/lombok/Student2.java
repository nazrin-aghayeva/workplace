package stepProject2.lombok;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Student2 {
  private int id;
  private String name;
  private int group;
}
