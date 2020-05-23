package stepProject2.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

@AllArgsConstructor
@Data // getter + setter + toString + eq + hc
@Value
public class Student4 {
  int id;
  String name;
  int group;
}
