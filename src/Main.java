import java.util.Arrays;

public class Main {
    static Employee[] employees = new Employee[10];
    public static void main(String[] args) {

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee("Андей Викторович Пресняков " + i, 1 + (i % 5), 25000 * (i + 1));
        }
        System.out.println("Наши сотрудники : ");
        printEmployees();
        System.out.println("b. Итоговая сумма затрат на зарплаты " + calculateTotalSalary(employees));
        System.out.println("c. Сотрудник с минимальной зарплатой " + getEmployeeWithMinSalary(employees));
        System.out.println("d. Сотрудник с максимальной зарплатой " + getEmployeeWithMaxSalary(employees));
        System.out.println("e. Среднее значение зарпалат " + calculateAverageSalary(employees));
        System.out.println("g. ФИО всех сотрудников ");
        printFullNameEmployees(employees);


    }

    private static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

    private static int calculateTotalSalary(Employee[] employees) {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    private static Employee getEmployeeWithMinSalary(Employee[] employees) {
        Employee result = employees[0];
        for (Employee employee : employees) {
            if (result.getSalary() < employee.getSalary()) {
                result = employee;
            }
        }
        return result;
    }

    private static Employee getEmployeeWithMaxSalary(Employee[] employees) {
        Employee result = employees[0];
        for (Employee employee : employees) {
            if (result.getSalary() < result.getSalary()) {
                result = employee;
            }
        }
        return result;
    }

    private static int calculateAverageSalary(Employee[] employees) {
        int totalSalary = calculateTotalSalary(employees);
        return totalSalary / employees.length;
    }

    private static void printFullNameEmployees(Employee[] employees) {
        for (Employee employee : employees) System.out.println(employee);
    }
}





