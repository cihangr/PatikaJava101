public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if (this.salary<1000){
            return 0.0;
        } else {
            return (this.salary*0.03);
        }
    }
    public int bonus(){
        if (this.workHours>40){
            return (30*(this.workHours-40));
        }else{
            return 0;
        }
    }
    public double raiseSalary(){
        if ((2021-this.hireYear)<10){
            return this.salary*0.05;
        } else if (9<(2021-this.hireYear) && (2021-this.hireYear)<20){
            return this.salary*0.1;
        }else {
            return this.salary*0.15;
        }
    }

    public void employeeInfo (){
        System.out.println("Adi: " + this.name);
        System.out.println("Maasi: " + this.salary);
        System.out.println("Calisma Saati: " + this.workHours);
        System.out.println("Baslangic Tarihi: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maas Artisi: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile maas: " + (this.salary-tax()+bonus()));
        System.out.println("Toplam Maas: " + (this.salary-tax()+bonus()+raiseSalary()));
    }

}
