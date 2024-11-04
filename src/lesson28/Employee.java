package lesson28;

import hw28.Rectangle;
import lists.MyListClassGen;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public Employee(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return  true;//link same obj
        if (!(obj instanceof  Employee)) return false;//casting check// Проверка на возможность привести к Employee
        Employee employee = (Employee) obj;
        //firstName.equals(employee.firstName);//null point exe possible
        // Objects.equals(null, employee.firstName)
        //when smth compared with null ->false

       return Objects.equals(firstName,employee.firstName)&&//save comparison including null values
              Objects.equals(lastName, employee.lastName)&&
              Objects.equals(dateOfBirth,employee.dateOfBirth);

    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(firstName);
        result = 31 * result + Objects.hashCode(lastName);
        return result;
    }


    public static void main(String[] args) {
        MyListClassGen<Employee> employee = new MyListClassGen<>();
        Employee employee1 = new Employee("Peter", "Petrov", "21.10.2000");
        Employee employee2 = new Employee("Ivan", "Ivanov", "05.12.1990");
        Employee employee3 = new Employee("Ivan", "Ivanov", "15.01.2001");
        Employee employee4 = new Employee("Ivan", "Ivanov", "15.01.2001");

        System.out.println(employee3 == employee4);//falses
        System.out.println(employee3.equals(employee4));//better use equals


    }
}
