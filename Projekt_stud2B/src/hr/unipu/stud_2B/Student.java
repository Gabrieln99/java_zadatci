package hr.unipu.studenti2B;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Klasa koja predstavlja studenta s njegovim podacima i ocjenama.
 *
 * @author Gabriel Nadal

 */
public class Student {
    private String name;
    private String surname;
    private String id;
    private List<Grade> grades;

    /**
     * Konstruktor inicijalizira praznu listu ocjena.
     */
    public Student() {
        this.grades = new ArrayList<>();
    }

    // GET & SET metode
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Dodaje ocjenu studentu.
     *
     * @param courseCode Šifra predmeta
     * @param courseName Naziv predmeta
     * @param grade Ocjena
     */
    public void addGrade(int courseCode, String courseName, int grade) {
        this.grades.add(new Grade(courseCode, courseName, grade));
    }

    /**
     * Vraća informacije o studentu.
     *
     * @return String s podacima studenta
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student: ").append(name).append(" ").append(surname)
                .append(" (ID: ").append(id).append(")\nOcjene:\n");

        for (Grade g : grades) {
            sb.append(g.toString()).append("\n");
        }
        return sb.toString();
    }

    /**
     * Provjera jednakosti studenata na temelju ID-a.
     *
     * @param obj Drugi objekt za usporedbu
     * @return True ako su ID-evi isti, false inače
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Objects.equals(id, student.id);
    }
}
