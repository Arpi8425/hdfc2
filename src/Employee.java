class Employee {
    private final String name;
    private final String role;
    private final int salary;
    public Employee(String name, String role, int salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    public int setSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }





    }

