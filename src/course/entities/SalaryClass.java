package course.entities;

public class SalaryClass {
    public String name;
    public double grossSalary , tax ,salaryIncrease;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary (double percentage){
        salaryIncrease = (grossSalary / percentage) + netSalary();
    }

    public String toString() {
        return "Employee: " + name + ", $ "+ netSalary();
    }
}
