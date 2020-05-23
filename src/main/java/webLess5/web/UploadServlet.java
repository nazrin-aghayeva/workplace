package webLess5.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UploadServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    try (OutputStream os = resp.getOutputStream()) {
      Files.copy(Paths.get("content", "upload.html"), os);
    }
  }

//  @Override
  protected void doPostDebug(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
    try (InputStream is = req.getInputStream()) {
      Files.copy(is, Paths.get("from_user", "whole_req.txt"));
    }

    try (PrintWriter os = resp.getWriter()) {
      os.write("OK");
    }
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
    for (Part part: req.getParts()) {
      part.getName();
      String filename = part.getSubmittedFileName();
      try (InputStream is = part.getInputStream()) {
//        Files.copy(is, Paths.get("from_user", timeprefix+filename));
        Files.copy(is, Paths.get("from_user", filename));
      }
    }

    try (PrintWriter os = resp.getWriter()) {
      os.write("OK");
    }
  }
}
