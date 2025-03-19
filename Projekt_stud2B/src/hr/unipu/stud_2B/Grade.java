package hr.unipu.studenti2B;

/**
 * Klasa koja pred. ocjenu studenta za određeni predmet.
 */
public class Grade {
    private int courseCode;
    private String courseName;
    private int grade;

    /**
     * Konstruktor klase Grade(ocjena).
     *
     * @param courseCode Šifra predmeta
     * @param courseName Naziv predmeta
     * @param grade Ocjena studenta
     */
    public Grade(int courseCode, String courseName, int grade) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.grade = grade;
    }

    /**
     * Pretvara objekt u formatirani string.
     *
     * @return String s podacima o ocjeni
     */
    @Override
    public String toString() {
        return courseCode + " - " + courseName + ": " + grade;
    }
}
