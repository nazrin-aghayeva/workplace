package webLogin;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.stream.Collectors;

public class LoginServlet extends HttpServlet {

    LoginApp login;

    public LoginServlet(LoginApp login){
        this.login= login;
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String content= new BufferedReader(new FileReader(new File("content/login.html"))).lines().
                collect(Collectors.joining("\n"));
        try(PrintWriter writer= resp.getWriter()){
            writer.write(content);
        }
   }

   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String username= req.getParameter("username");
        String email= req.getParameter("email");
        String password= req.getParameter("password");

        try(PrintWriter writer= resp.getWriter()){
            writer.write(login.add(username, email, password));
        }
   }
}
