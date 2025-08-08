import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        MathOperation add = new Addition();
//        System.out.println(add.operate(2, 2));
//
//
//
//        NamePrinter printer = (String name ) -> System.out.println(name);
//
//
//
//        printer.printName("arpita");
//
//        Consumer<String> printerr= (s) -> System.out.println(s);
//        printerr. accept("Hello");

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Develop",222),
                new Employee("mrunali", "Test",4),
                new Employee("Charlie", "Develop",34)
        );
        List<String> developers = employees.stream()
                .filter(e -> e.getRole().equals("Develop"))
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(developers);

        //Sort Employee by Salary
        List<Employee>sorted = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());
        System.out.println(sorted);

    }
}