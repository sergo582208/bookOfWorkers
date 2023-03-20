public class Employee {
    private final String fullName;
    private int departure;
    private int salary;

    private int id;
    private static int counter = 0;

    public Employee(String fullName, int departure, int salary) {
        this.fullName = fullName;
        this.departure = departure;
        this.salary = salary;
        this.id = ++counter;

    }

    public String getFullName() {
        return fullName;
    }

public int getDeparture(){
            return departure;

        }
        public int getSalary(){
        return salary;
        }
        public void setDeparture(){
        this.departure = departure;
        }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString(){
       return ("ФИО " + this.fullName + " департамент " + this.departure + " зарплата " + this.salary);
    }
}

