package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private String dept;
    private String city;

    public Employee(String name, String dept, String city) {
        this.name = name;
        this.dept = dept;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getCity() {
        return city;
    }
}

public class EmployeeStream {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Purushottam", "IT", "Parbhani"),
                new Employee("Rohit", "HR", "Mumbai"),
                new Employee("Sneha", "Finance", "Pune"),
                new Employee("Amit", "IT", "Nagpur"),
                new Employee("Priya", "HR", "Parbhani"),
                new Employee("Vikram", "Finance", "Mumbai"),
                new Employee("Sonal", "IT", "Pune"),
                new Employee("Aniket", "Sales", "Aurangabad"),
                new Employee("Kiran", "Marketing", "Mumbai"),
                new Employee("Meena", "IT", "Aurangabad"),
                new Employee("Rajesh", "Finance", "Pune"),
                new Employee("Deepak", "Sales", "Nagpur"),
                new Employee("Pooja", "IT", "Mumbai"),
                new Employee("Suresh", "HR", "Aurangabad"),
                new Employee("Nikita", "Finance", "Parbhani"),
                new Employee("Amol", "IT", "Pune"),
                new Employee("Swati", "Marketing", "Nagpur"),
                new Employee("Ganesh", "Finance", "Mumbai"),
                new Employee("Kavita", "HR", "Pune"),
                new Employee("Manoj", "IT", "Mumbai"),
                new Employee("Ramesh", "Sales", "Parbhani")
        );

        Map<String, String> cityNameMap = employees.stream()
                .collect(Collectors.toMap(Employee::getCity, Employee::getName, (existing, replacement) -> existing));


        for (Map.Entry<String, String> map: cityNameMap.entrySet() ){
            System.out.println(map.getKey()+" -> "+map.getValue());
        }

        List<List<Employee>> nestedEmployeeList = Arrays.asList(
                Arrays.asList(
                        new Employee("Purushottam", "IT", "Parbhani"),
                        new Employee("Rohit", "HR", "Mumbai"),
                        new Employee("Sneha", "Finance", "Pune"),
                        new Employee("Amit", "IT", "Nagpur")
                ),
                Arrays.asList(new Employee("Priya", "HR", "Parbhani"),
                        new Employee("Vikram", "Finance", "Mumbai"),
                        new Employee("Sonal", "IT", "Pune"),
                        new Employee("Aniket", "Sales", "Aurangabad"),
                        new Employee("Kiran", "Marketing", "Mumbai")
                ),
                Arrays.asList(
                        new Employee("Meena", "IT", "Aurangabad"),
                        new Employee("Rajesh", "Finance", "Pune"),
                        new Employee("Deepak", "Sales", "Nagpur"),
                        new Employee("Pooja", "IT", "Mumbai")
                ),
                Arrays.asList(
                        new Employee("Suresh", "HR", "Aurangabad"),
                        new Employee("Nikita", "Finance", "Parbhani"),
                        new Employee("Amol", "IT", "Pune")
                ),
                Arrays.asList(
                        new Employee("Swati", "Marketing", "Nagpur"),
                        new Employee("Ganesh", "Finance", "Mumbai"),
                        new Employee("Kavita", "HR", "Pune"),
                        new Employee("Manoj", "IT", "Mumbai"),
                        new Employee("Ramesh", "Sales", "Parbhani")
                )
        );
        System.out.println("\nExtracting the nested list!");
        List<Employee> flattenEmployeesList = nestedEmployeeList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        for (Employee employee : flattenEmployeesList){
            System.out.println(employee.getName()+" "+ employee.getDept()+" "+employee.getCity());
        }

        Map<String, List<String>> departmentWiseEmployee = employees.stream()
                .collect(Collectors.groupingBy( Employee::getDept,
                        Collectors.mapping(Employee::getName, Collectors.toList())
                ));

        System.out.println("\n grouped employees by department");
        for (Map.Entry<String, List<String>> map: departmentWiseEmployee.entrySet() ){
            System.out.println(map.getKey()); List<String> names = map.getValue();
            System.out.print(names+"\n");
        }
    }
}
