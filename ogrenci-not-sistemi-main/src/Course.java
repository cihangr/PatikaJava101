//Course Sınıfı Özellikleri :
//
//Nitelikler : name,code,prefix,note,Teacher
//Metotlar : Course() , addTeacher() , printTeacher()

public class Course {
    String name;
    int code;
    String prefix;
    double note;
    int verbalNote;
    Teacher teacher;
    int sNote;

    public Course(String name, int code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher (Teacher teacher) {
        if (teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
            System.out.println(teacher.name+" ogretmen "+ this.prefix + " dersine atandi.");
        }else {
            System.out.println("Bu ogretmen farkli bir bransta calismaktir!");
        }
    }

    public void printTeacher() {
        if (teacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + teacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

}

