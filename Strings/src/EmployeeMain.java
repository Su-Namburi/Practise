import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        // Initialize a list of Employee objects using Java 8
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "Doe", 30, "IT", 60000, 2015, "New York", "Male"),
                new Employee(2, "Alice", "Smith", 28, "HR", 55000, 2017, "Los Angeles", "Female"),
                new Employee(3, "Mike", "Johnson", 35, "Finance", 70000, 2010, "Chicago", "Male"),
                new Employee(4, "Ishan", "Kishan", 26, "IT", 80000, 2022, "Bihar India", "Male"),
                new Employee(4, "prithvi", "Shaw", 28, "Product Development", 90000, 2022, "Bihar India", "Male"),
                new Employee(4, "Aaksh", "Deep", 25, "Product Development", 70000, 2021, "Delhi India", "Male"),
                new Employee(1, "sehwag", "Doe", 38, "IT", 90000, 2012, "Noida India", "Male"),
                new Employee(1, "Ankita", "kohali", 38, "IT", 92000, 2011, "Gurugram India", "Female")
        );

        //list of employees from it dept
        List<Employee> itEmployees = employees.stream().filter(e -> e.getDepartment().equals("IT")).collect(Collectors.toList());
        for(Employee e : itEmployees) {
            System.out.println(e.getFirstName());
        }
       
    }
}
