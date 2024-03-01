import java.sql.SQLOutput;
import java.time.LocalDate;

public class Student implements Study {
    private String name;
    private String surName;
    private String gender;
    private LocalDate dateOfStart;
    private EducationCenter educationCenter;

    public Student() {
    }

    public Student(String name, String surName, String gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surName = surName;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public EducationCenter getEducationCenter() {
        return educationCenter;
    }

    public void setEducationCenter(EducationCenter educationCenter) {
        this.educationCenter = educationCenter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfStart=" + dateOfStart +
                ", educationCenter=" + educationCenter +
                '}';
    }
@Override
    public void getStudentsEducationCenter(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " study in " + students[i].educationCenter.getName());

        }

    }
@Override
    public  void getStudentsStudyingYear(Student[]students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name+ " studying year "+students[i].getDateOfStart());


        }

    }
}
