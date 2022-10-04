

public class Main {

    public static void main(String[] args){


        Employee employee = new Employee("Ege",6500,42,1987) ;
        float firstSalary= employee.salary ;

        employee.tax();

        employee.bonus();
         float salaryWithBonusandTax = employee.salary ;
        employee.raiseSalary();

        employee.toStringg();

        System.out.println("Tax: "+employee.tax);
        System.out.println("Bonus: "+employee.bonus);
        System.out.println("Maaş Artışı: "+(employee.salary - firstSalary));
        System.out.println("Vergi ve Bonuslarla beraber maaş: "+salaryWithBonusandTax);

    }}































