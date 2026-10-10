package school.a18._8_tp_final.model;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {
    private static ListStudent instance;
    private List<Student> students;

    private ListStudent() {
        this.students = new ArrayList<>();
        this.students.add(new Student("Tremblay", "Lea", "Reseaux"));
        this.students.add(new Student("Roy", "Noah", "Programmation"));
        this.students.add(new Student("Gagnon", "Emma", "Cybersecurite"));
        this.students.add(new Student("Bouchard", "Adam", "Donnees"));
        this.students.add(new Student("Cote", "Mia", "Cloud"));
    }

    public static ListStudent getInstance() {
        if (instance == null) {
            instance = new ListStudent();
        }
        return instance;
    }

    public List<Student> getStudents() {
        return List.copyOf(students);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(String nom, String prenom) {
        students.removeIf(s -> s.getNom().equalsIgnoreCase(nom) &&
                s.getPrenom().equalsIgnoreCase(prenom));
    }
}
