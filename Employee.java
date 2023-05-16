public class Employee {
    private String FIO;
    private int department;
    private float salary;
    int id = Main.cnt;

    public Employee(String FIO, int department, float salary) {
        this.FIO = FIO;
        this.department = department;
        this.salary = salary;
        Main.cnt++;

    }

    public String getFIO() {
        return FIO;
    }
    public int getDepartment() {
        return department;
    }
    public float getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id +": сотрудник - " + FIO + ", отдел - " + department + ", зарплата - " + salary +".";
    }

}