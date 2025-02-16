/*
 How to build this file?

 javac -cp $TOMCAT_HOME/lib/servlet-api.jar:. HelloWorld.java

*/

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.lang.annotation.*;

@WebServlet("/hello")
public class HelloWorld extends HttpServlet {
        @Override
        public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {
                response.setContentType("text/plain");
                var out = response.getWriter();
                out.println("hello world, tomcat");
        }
}
