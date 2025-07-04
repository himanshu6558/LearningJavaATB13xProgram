package ex_17_OOPs.Inheritance.Multilevel;

public class Employee extends Person{
    int empID;
    double salary;

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getEmpID() {
        return empID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
