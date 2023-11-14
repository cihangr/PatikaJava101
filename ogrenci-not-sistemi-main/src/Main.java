
public class Main {
    public static void main(String[] args) {
        Teacher A1 = new Teacher("Cihan", 555100100,"MAT");
        Teacher A2 = new Teacher("Maria", 555100101,"FZK");
        Teacher A3 = new Teacher("Danyal", 555100102,"KMY");

        Course MAT = new Course("Matematik",001,"MAT");
        Course FIZIK = new Course("Fizik",002,"FZK");
        Course KIMYA = new Course("Kimya",003,"KMY");

        MAT.addTeacher(A1);
        MAT.printTeacher();

        FIZIK.addTeacher(A2);
        FIZIK.printTeacher();

        KIMYA.addTeacher(A3);
        KIMYA.printTeacher();

        Student mario = new Student("Mario", 99, 2, MAT,FIZIK,KIMYA);
        Student luigi = new Student("Luigi", 100, 2, MAT,FIZIK,KIMYA);
        Student princess = new Student("Princess", 101, 2, MAT,FIZIK,KIMYA);

        mario.addBulkExamNote(100,90,85);
        mario.addVerbalNote(90,90,90);
        mario.calcAverage();
        mario.isPass();
        mario.printNote();



    }
}
