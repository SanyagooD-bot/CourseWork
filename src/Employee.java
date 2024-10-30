public class Employee {
    private static int idGenerator = 1;
    private int id; //id
    private String FullName; // Полное имя
    private int department; //Отдел
    private int salary; //Запрлата

    public Employee(String FullName, int  department, int salary){
        id = idGenerator++;
        this.FullName = FullName;
        this.department = department;
        this.salary = salary;
    }

    public int getDepartment(){
        return department;
    }
    public void setDepartment(int department) {
        this.department = department;
    }

    public String getFullName() {
        return FullName;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                "id - " + id +
                ", Ф.И.О = '" + FullName + '\'' +
                ", Отдел = " + department +
                ", Зарплата = " + salary;
    }
}
