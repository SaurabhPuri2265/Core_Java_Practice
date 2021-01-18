package collectionsFramework;

//Defining a class employee which implements comparable interface

public class Employee implements Comparable<Employee>{
    String name;
    int salary;
    String dept;

    public Employee(String name, int salary, String dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {

        if(this.salary < employee.salary)
            return -1;
        else if(this.salary > employee.salary)
            return +1;
        return 0;

    }
}
