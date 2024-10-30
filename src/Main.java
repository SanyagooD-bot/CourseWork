import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Курсовая работа - Книга сотрудников");
        System.out.println("----------------------------------------------------------------------");
        initEmployees();
        printEmployees();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Сумма заплаты сотрудников = " + lateSalor());
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Сотрудник с минимальной зарплатой = " + minSalary());
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Сотрудник с максимальной зарплатой = " + maxSalary());
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Средняя зарплата = " + averageSalor());
        System.out.println("----------------------------------------------------------------------");
        printFullName();
        System.out.println("----------------------------------------------------------------------");
    }

    private static Random random = new Random();
    private static final String[] name = {"Степан", "Артём", "Антон", "Арсений", "Александр"};
    private static final String[] surname = {"Королев", "Романов", "Овчинников", "Герасимов", "Мартынов"};
    private static final String[] patronymic = {"Ефимович", "Борисович", "Алексеевич", "Игоревич", "Евгеньевич"};
    private static Employee[] employees = new Employee[10];

    public static void initEmployees() {
        for (int i = 0; i < employees.length; i++) {
            String fullName = surname[random.nextInt(0, surname.length)] + " " +
                    name[random.nextInt(0, name.length)] + " " +
                    patronymic[random.nextInt(0, patronymic.length)];
            employees[i] = new Employee(fullName, random.nextInt(1, 6), random.nextInt(20_000, 70_000));
        }
    }

    public static void printEmployees() {
        for (Employee employees : employees) {
            System.out.println(employees);
        }
    }

    private static int lateSalor() {
        int sum = 0;
        for (Employee employees : employees) {
            sum += employees.getSalary();
        }
        return sum;
    }

    private static Employee minSalary() {
        Employee minSalary = null;
        for (Employee employees : employees) {
            if (minSalary == null || employees.getSalary() < minSalary.getSalary()) {
                minSalary = employees;
            }
        }
        return minSalary;
    }

    private static Employee maxSalary() {
        Employee maxSalary = null;
        for (Employee employees : employees) {
            if (maxSalary == null || employees.getSalary() > maxSalary.getSalary()) {
                maxSalary = employees;
            }
        }
        return maxSalary;
    }

    private static double averageSalor() {
        return (double) lateSalor() / employees.length;
    }

    public static void printFullName() {
        for (Employee employees : employees) {
            System.out.println(employees.getFullName());
        }
    }
}
