import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.HashMap;
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
                new Employee("Alice", "Develop",222
                ),
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

        //Linkedlist
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Write report");
        tasks.add("Email Client");
        System.out.println(tasks);

        //HashSet
        HashSet<String> countries = new HashSet<>();
        countries.add("India");
        countries.add("USA");
        countries.add("India");
        System.out.println(countries);

        //Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        while ((!pq.isEmpty())){
            System.out.println(pq.poll());
        }

        //ArrayDeque
        ArrayDeque<String> dq = new ArrayDeque<>();
        dq.add("First");
        dq.addLast(("Second"));
        dq.addFirst("Zero");
        System.out.println(dq);

        //Hashmap
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"Amit");
        map.put(102,"Neha");
        map.put(103,"Ravi");
        System.out.println(map.get(102));
    }
}