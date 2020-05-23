package webLesson7.jackson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ServletConsume extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // request body
    BufferedReader body_reader = req.getReader();

    ObjectMapper mapper = new ObjectMapper();
    // one entity
//    Student read = mapper.readValue(body_reader, Student.class);
    // several entities
//    Student[] students1 = mapper.readValue(body_reader, Student[].class);
    List<Student> students2 = mapper.readValue(body_reader, new TypeReference<List<Student>>() {});


//    System.out.println(Arrays.toString(students1));
    System.out.println(students2);

    try (PrintWriter w = resp.getWriter()){
      w.write("got");
    }
  }
}
