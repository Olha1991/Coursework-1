import static java.lang.Integer.MAX_VALUE;

public class Main {

    static Employees[] employee = new Employees[10];

    public static void main(String[] args) {
        employee[0] = new Employees("Sarah", "Smith", 5, 6550);
        employee[1] = new Employees("Emily", "King", 2, 6250);
        employee[2] = new Employees("Mark", "Bennet", 3, 5685);
        employee[3] = new Employees("Lisa", "Miller", 3, 5650);
        employee[4] = new Employees("Jason", "Davis", 5, 6500);
        employee[5] = new Employees("Kevin", "Brown", 4, 5800);
        employee[6] = new Employees("Betty", "Ford", 2, 5600);
        employee[7] = new Employees("Gary", "Peterson", 1, 6300);
        employee[8] = new Employees("Nicholas", "Vargas", 1, 7900);
        employee[9] = new Employees("Donna", "Kim", 4, 5850);

        printAllEmployees();
        System.out.println("Amount of salary expenses per month - $" + sumSalary());
        System.out.println("Employee with the minimum salary - $" + minSalary());
        System.out.println("Employee with the maximum salary - $" + maxSalary());
        System.out.println("Average salary - $" + averageSalary());
        fullNameEmployees();

        salaryIndex(10);
        findEmployeeInDepartment(2);
        System.out.println("Employee with the minimum salary in department: " + employeeWithMinSalaryDep(5));
        System.out.println("Employee with the maximum salary in department: " + employeeWithMaxSalaryDep(5));
        System.out.println("The department's expenses are $" + departmentExpenses(2));
        System.out.println("Average salary in department - $" + averageSalaryByDepartment(5));
        salaryIndexByDepartment(2,10);
        PrintEmployeesWithoutDepartment();
        searchEmployeesIfSalaryMoreNumber(6500);
        System.out.println();
        searchEmployeesIfSalaryLessNumber(6500);
    }

    public static double sumSalary() {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sum += employee[i].getSalary();
            }
        }
        return sum;
    }

    public static Employees minSalary() {
        Employees minSalaryEmployee = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee[i];
            }
        }
        return minSalaryEmployee;
    }

    public static Employees maxSalary() {
        double maxSalary = 0;
        Employees maxSalaryEmployee = null;
        int x = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                maxSalary = maxSalary + employee[i].getSalary();
                maxSalaryEmployee = employee[i];
                x = i;
                break;
            }
        }
        for (int i = x; i < employee.length; i++) {
            if (employee[i] != null) {
                if (employee[i].getSalary() > maxSalary) {
                    maxSalary = employee[i].getSalary();
                    maxSalaryEmployee = employee[i];
                }
            }
        }
        return maxSalaryEmployee;
    }

    public static double averageSalary() {
        if (employee.length != 0) {
            return sumSalary() / employee.length;
        } else {
            return 0;
        }
    }

    public static void printAllEmployees() {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].toString());
            }
        }
    }

    public static void fullNameEmployees() {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].getFirstName() + " " + employee[i].getLastName());
            }
        }
    }

    public static void salaryIndex(int percent) {
        for (int i = 0; i < employee.length; i++) {
            employee[i].setSalary(employee[i].getSalary() + employee[i].getSalary() * percent / 100);
            System.out.println(employee[i].toString());
        }
    }

    public static void findEmployeeInDepartment(int department) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == department) {
                System.out.println(employee[i].toString());
            }
        }
    }


    public static Employees employeeWithMinSalaryDep(int department) {
                Employees employeeMinSalary = employee[0];
                for (int i = 0; i < employee.length; i++) {
                    if (employee[i] != null && employee[i].getDepartment() == department
                            &&  employee[i].getSalary() < employeeMinSalary.getSalary()) {
                        employeeMinSalary = employee[i];
                    }
                }
                return employeeMinSalary;
    }

    public static Employees employeeWithMaxSalaryDep (int department) {
        double maxSalary = 0;
        Employees maxSalaryEmployee = null;
        int x = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == department && employee[i] != null) {
                maxSalary = maxSalary + employee[i].getSalary();
                maxSalaryEmployee = employee[i];
                x = i;
                break;
            }
        }
        for (int i = x; i < employee.length; i++) {
            if (employee[i] != null) {
                if (employee[i].getDepartment() == department && employee[i].getSalary() > maxSalary) {
                    maxSalary = employee[i].getSalary();
                    maxSalaryEmployee = employee[i];
                }
            }
        }
        return maxSalaryEmployee;
    }

    public static double departmentExpenses (int department) {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == department){
                sum += employee[i].getSalary();
            }
        }
        return sum;
    }

    public static double averageSalaryByDepartment(int department) {
        int sum = 0;
        double averageSum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == department){
                sum++;
                departmentExpenses(department);
               averageSum = departmentExpenses(department) / sum;
            }
        }
        return averageSum;
    }

    public static void salaryIndexByDepartment (int department, int percent) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == department){
            employee[i].setSalary(employee[i].getSalary() + employee[i].getSalary() * percent / 100);
            System.out.println(employee[i].toString());
            }
        }
    }

    public static void PrintEmployeesWithoutDepartment () {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println("Employee: " + employee[i].getFirstName() +
                        " " + employee[i].getLastName() + " - $" + employee[i].getSalary());
            }
        }
    }

    public static void searchEmployeesIfSalaryMoreNumber (int number) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() >= number) {
                System.out.println(employee[i].toString());
            }
        }
    }

    public static void searchEmployeesIfSalaryLessNumber (int number) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSalary() <= number) {
                System.out.println(employee[i].toString());
            }
        }
    }
}