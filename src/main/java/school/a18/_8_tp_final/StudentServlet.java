package school.a18._8_tp_final;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import school.a18._8_tp_final.model.ListStudent;
import school.a18._8_tp_final.model.Student;

@WebServlet(name = "StudentServlet", value = "/StudentServlet", loadOnStartup = 1)
public class StudentServlet extends HttpServlet {
    private ListStudent listOfStudent;

    public void init() {
        listOfStudent = ListStudent.getInstance();

        for (Student student : listOfStudent.getStudents()) {
            System.out.println(student);
        }
    }

    //Commentaire ajouter pour tester le pipeline
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        for (Student student : listOfStudent.getStudents()) {
            response.getWriter().println(student);
        }
    }

    public void destroy() {
    }
}