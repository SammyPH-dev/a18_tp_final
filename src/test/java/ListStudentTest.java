import org.junit.jupiter.api.Test;
import school.a18._8_tp_final.model.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ListStudentTest {

    @Test
    void addedStudentCanBeRetrieved() {
        ListStudent listStudent = ListStudent.getInstance();
        int compteAvant = listStudent.getStudents().size();

        Student student = new Student("test", "Alex", "Programmation");

        try {
            listStudent.addStudent(student);

            assertEquals(compteAvant + 1, listStudent.getStudents().size());
            assertTrue(listStudent.getStudents().contains(student));
        } finally {
            // Clean up because the singleton keeps shared state.
            listStudent.removeStudent("test", "Alex");
        }
    }

    @Test
    void studentDisplayContainsAllFields() {
        Student student = new Student("Tremblay", "Lea", "Reseaux");

        String display = student.toString();

        assertTrue(display.contains("Nom: Tremblay"));
        assertTrue(display.contains("Prenom: Lea"));
        assertTrue(display.contains("Specialite: Reseaux"));
    }
}