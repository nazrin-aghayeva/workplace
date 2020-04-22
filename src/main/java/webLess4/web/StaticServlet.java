package webLess4.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StaticServlet extends HttpServlet {

  private final String subPath;

  public StaticServlet(String subPath) {
    this.subPath = subPath;
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    /**
     * 1. get the file name from the request
     * 2. translate the file name to the object File (Path)
     * 3. read this File
     * 4. write file read to response.outputStream
     */
    // 1
    String filename = req.getPathInfo();
    String osFileLocation = "content";
    // 2
    Path path = Paths.get(osFileLocation, subPath, filename);

    try (OutputStream os = resp.getOutputStream()) {
      // 3 & 4
      Files.copy(path, os);
    }
  }
}
