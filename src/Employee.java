public class Employee {
    String name;
    float salary ;
    int   workHours ;
    int   hireYear ;
    float tax= 0 ;
    short bonus =0 ;
 public Employee(String name, float salary, int workHours,int hireYear){
this.name  =name;
this.salary = salary;
this.workHours=workHours;
this.hireYear=hireYear;
 }

 public void tax(){
if(!(salary<1000)){
     tax = (float) (salary*(0.03));
    salary= salary - tax;

}
 }


 public void bonus(){
if(workHours>40){
     bonus = (short) ((workHours- 40)*30);
     salary = salary + bonus ;
}
 }
 public void raiseSalary(){
 short now =2021 ;
  short workTime= (short) (now - hireYear);

  if(workTime<10){
      salary = salary + salary/20 ;
  }
    else if(workTime>9 && workTime<20){
         salary = salary + salary/10 ;
     }
  else if(workTime>19){
      salary = salary + salary*3/20 ;
  }


 }
 void toStringg(){
System.out.println("Name: "+name);
System.out.println(name+"'s "+" Total Salary: "+salary);
System.out.println(name+"'s "+"Work hours: "+workHours);
System.out.println(name+"'s "+"Hire Year: "+hireYear);



 }

}