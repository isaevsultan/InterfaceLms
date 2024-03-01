import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**    EducationCenter деген абстракт класс тузунуз. Полелери: name, locatedCountry, LocalDate foundationYear;
         Абстракт класска School , University, College деген саб класстарды тузунуз.
         Study деген интерфейс тузуп, ичине void getStudentsEducationCenter(), void getStudentsStudyingYear()  деген 2 метод тузунуз.
         Student деген класс тузунуз. Полелери: name, surname, Gender gender,  LocalDate dateOfStart()(студент кайсыл жылы окуп баштаганы), EducationCenter educationCenter;
         Main класста студенттердин массивин тузуп ичине 10 студент салыныз. Студенттер ар кандай окуу жайда окусун.
         Main класста 1 метод тузунуз.
         1 - метод бардык студенттер жонундо маалыматты, кайсыл студент кайсы окуу жайда окуганы тууралу маалыматты жана окуганыны канча жыл болгону тууралу маалыматты чыгарып берсин.**/
        EducationCenter college = new College("Gardward", "AMERICA", LocalDate.of(1345, 6, 23));
        EducationCenter university = new University("POLITEX", "Kyrgyzstan", LocalDate.of(1954, 3, 4));
        EducationCenter school = new School("Лицей 34", "Kyrgyztan", LocalDate.of(2004, 7, 23));


        Student student1 = new Student("Sultan", "Isaev", "M", LocalDate.of(2024, 1, 5), college);
        Student student2 = new Student("Kunduz", "Isaeva", "F", LocalDate.of(1999, 2, 20), school);
        Student student3 = new Student("Nurdan", "Nurmatov", "M", LocalDate.of(2002, 3, 22), university);
        Student student4 = new Student("Vldaislav", "Borisovich", "M", LocalDate.of(1993, 4, 18), university);
        Student student5 = new Student("Kuku", "Satybekov", "M", LocalDate.of(2002, 7, 20), college);
        Student student6 = new Student("Nurjamal", "Bolotbekovna", "F", LocalDate.of(2004, 3, 23), university);
        Student student7 = new Student("ADILET", "Sagynbekov", "M", LocalDate.of(20001, 5, 1), school);
        Student student8 = new Student("Nazgul", "Satybekovna", "F", LocalDate.of(2002, 6, 12), university);
        Student student9 = new Student("Ivan", "Subulov", "M", LocalDate.of(1990, 5, 20), university);
        Student student10 = new Student("Natalia", "Aleksandrovna", "F", LocalDate.of(1996, 6, 24), school);

        Student[] students = new Student[]{student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};
        getInformation(students);
    student6.getStudentsEducationCenter(students);
        System.out.println("---------------------");
    student6.getStudentsStudyingYear(students);



    }

    private static void getInformation(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);


        }

    }


}