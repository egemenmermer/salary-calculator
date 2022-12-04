public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(int salary){
        if(salary > 1000){
            return salary * 0.03;
        }else {
            return 0;
        }
    }

    public double bonus(int workHours){
        if(this.workHours > 40){
            return (this.workHours - 40) * 30;
        }else {
            return 0;
        }
    }

    public double raiseSalary(int hireYear){
        if((2022 - this.hireYear) < 10){
            return this.salary * 0.05;
        }else if ((2022 - this.hireYear) > 9 && (2022 - this.hireYear) < 20){
            return this.salary * 0.10;
        } else if ((2022 - this.hireYear) > 19) {
            return this.salary * 0.15;
        } else {
            return 0;
        }
    }

    public void printEmployee(){
        System.out.println("------------");
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax(this.salary));
        System.out.println("Bonus : " + bonus(this.workHours));
        System.out.println("Maaş Artışı : " + raiseSalary(this.hireYear));
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + bonus(this.workHours) - tax(this.salary)));
        System.out.println("Toplam Maaş : " + ((this.salary + bonus(this.workHours) - tax(this.salary)) + raiseSalary(this.hireYear)));
    }
}
