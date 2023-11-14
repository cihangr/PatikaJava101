//Student Sınıfı Özellikleri :
//
//Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
//Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()

import java.util.Scanner;

public class Student {
    String name;
    int stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    public Student (String name, int stuNo, int classes, Course mat, Course fizik, Course kimya){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
    }

    public void addBulkExamNote (double matNote, double fizikNote, double kimyaNote ){
        if (matNote>=0 && matNote<=100){
            this.mat.note = matNote;
        }
        if (fizikNote>=0 && fizikNote<=100){
            this.fizik.note = fizikNote;
        }
        if (kimyaNote>=0 && kimyaNote<=100){
            this.kimya.note = kimyaNote;
        }
    }public void addVerbalNote (int verbalMat, int verbalFizik, int verbalKimya ){
        if (verbalMat>=0 && verbalMat<=100){
            this.mat.verbalNote = verbalMat;
        }
        if (verbalFizik>=0 && verbalFizik<=100){
            this.fizik.verbalNote = verbalFizik;
        }
        if (verbalKimya>=0 && verbalKimya<=100){
            this.kimya.verbalNote = verbalKimya;
        }
    }

    public void calcAverage () {
        double matNote = (this.mat.note*0.8)+(this.mat.verbalNote*0.2);
        double fizikNote = (this.fizik.note*0.8)+(this.fizik.verbalNote*0.2);
        double kimyaNote = (this.kimya.note*0.8)+(this.kimya.verbalNote*0.2);
        this.average = (matNote+fizikNote+kimyaNote )/3.0;
        System.out.println(this.name + " derslerinin ortalamasi: " + this.average);
    }

    public void isPass () {
        if (this.average>=55) {
            System.out.println("Tebrikler Sinifi Gectiniz.");
            this.isPass = true;
        } else {
            System.out.println("Tecrubeler bizi daha iyi yapmak icindir. Tekrar deneyiniz.");
            this.isPass = false;
        }
    }

    public void printNote () {
        System.out.println("----------------------------------");
        System.out.println("Ogrenci: "+this.name);
        System.out.println("Matematik: "+this.mat.note);
        System.out.println("Fizik: "+this.fizik.note);
        System.out.println("Kimya: "+this.kimya.note);
        System.out.println("----------------------------------");
    }





}
