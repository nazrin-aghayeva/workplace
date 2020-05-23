package webLesson7.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class ServletProvide extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    Student s0 = new Student("Jim", 20, "BE4");
    s0.setResponsibilities(Arrays.asList("A","N","Y"));
    List<Student> students = Arrays.asList(
        new Student("Jim", 20, "BE4"),
        new Student("Jack", 21, "BE3"),
        new Student("Jeremy", 25, "BE1")
    );
    ObjectMapper mapper = 
        new ObjectMapper(); // JSON
//        new XmlMapper(); // XML
    String json = mapper.writeValueAsString(s0);

    resp.setStatus(200);
    // we need to pass that data to the JS guys
    try (PrintWriter w = resp.getWriter()){
      w.write(json);
    }
  }
}
